// Code generated by protoc-gen-go. DO NOT EDIT.
// source: gomatcha.io/matcha/pb/touch/touch2.proto

/*
Package touch is a generated protocol buffer package.

It is generated from these files:
	gomatcha.io/matcha/pb/touch/touch2.proto

It has these top-level messages:
	Recognizer
	RecognizerList
	ButtonRecognizer
	ButtonEvent
	TapRecognizer
	TapEvent
	PressRecognizer
	PressEvent
*/
package touch

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import google_protobuf "github.com/golang/protobuf/ptypes/any"
import google_protobuf1 "github.com/golang/protobuf/ptypes/duration"
import google_protobuf2 "github.com/golang/protobuf/ptypes/timestamp"
import matcha_layout "gomatcha.io/matcha/pb/layout"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type EventKind int32

const (
	EventKind_EVENT_KIND_POSSIBLE   EventKind = 0
	EventKind_EVENT_KIND_CHANGED    EventKind = 1
	EventKind_EVENT_KIND_FAILED     EventKind = 2
	EventKind_EVENT_KIND_RECOGNIZED EventKind = 3
)

var EventKind_name = map[int32]string{
	0: "EVENT_KIND_POSSIBLE",
	1: "EVENT_KIND_CHANGED",
	2: "EVENT_KIND_FAILED",
	3: "EVENT_KIND_RECOGNIZED",
}
var EventKind_value = map[string]int32{
	"EVENT_KIND_POSSIBLE":   0,
	"EVENT_KIND_CHANGED":    1,
	"EVENT_KIND_FAILED":     2,
	"EVENT_KIND_RECOGNIZED": 3,
}

func (x EventKind) String() string {
	return proto.EnumName(EventKind_name, int32(x))
}
func (EventKind) EnumDescriptor() ([]byte, []int) { return fileDescriptor0, []int{0} }

type Recognizer struct {
	Id         int64                `protobuf:"varint,1,opt,name=id" json:"id,omitempty"`
	Recognizer *google_protobuf.Any `protobuf:"bytes,3,opt,name=recognizer" json:"recognizer,omitempty"`
}

func (m *Recognizer) Reset()                    { *m = Recognizer{} }
func (m *Recognizer) String() string            { return proto.CompactTextString(m) }
func (*Recognizer) ProtoMessage()               {}
func (*Recognizer) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{0} }

func (m *Recognizer) GetId() int64 {
	if m != nil {
		return m.Id
	}
	return 0
}

func (m *Recognizer) GetRecognizer() *google_protobuf.Any {
	if m != nil {
		return m.Recognizer
	}
	return nil
}

type RecognizerList struct {
	Recognizers []*Recognizer `protobuf:"bytes,1,rep,name=recognizers" json:"recognizers,omitempty"`
}

func (m *RecognizerList) Reset()                    { *m = RecognizerList{} }
func (m *RecognizerList) String() string            { return proto.CompactTextString(m) }
func (*RecognizerList) ProtoMessage()               {}
func (*RecognizerList) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{1} }

func (m *RecognizerList) GetRecognizers() []*Recognizer {
	if m != nil {
		return m.Recognizers
	}
	return nil
}

type ButtonRecognizer struct {
	OnEvent       int64 `protobuf:"varint,1,opt,name=onEvent" json:"onEvent,omitempty"`
	IgnoresScroll bool  `protobuf:"varint,2,opt,name=ignoresScroll" json:"ignoresScroll,omitempty"`
}

func (m *ButtonRecognizer) Reset()                    { *m = ButtonRecognizer{} }
func (m *ButtonRecognizer) String() string            { return proto.CompactTextString(m) }
func (*ButtonRecognizer) ProtoMessage()               {}
func (*ButtonRecognizer) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{2} }

func (m *ButtonRecognizer) GetOnEvent() int64 {
	if m != nil {
		return m.OnEvent
	}
	return 0
}

func (m *ButtonRecognizer) GetIgnoresScroll() bool {
	if m != nil {
		return m.IgnoresScroll
	}
	return false
}

type ButtonEvent struct {
	Timestamp *google_protobuf2.Timestamp `protobuf:"bytes,1,opt,name=timestamp" json:"timestamp,omitempty"`
	Inside    bool                        `protobuf:"varint,3,opt,name=inside" json:"inside,omitempty"`
	Kind      EventKind                   `protobuf:"varint,4,opt,name=kind,enum=matcha.touch.EventKind" json:"kind,omitempty"`
}

func (m *ButtonEvent) Reset()                    { *m = ButtonEvent{} }
func (m *ButtonEvent) String() string            { return proto.CompactTextString(m) }
func (*ButtonEvent) ProtoMessage()               {}
func (*ButtonEvent) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{3} }

func (m *ButtonEvent) GetTimestamp() *google_protobuf2.Timestamp {
	if m != nil {
		return m.Timestamp
	}
	return nil
}

func (m *ButtonEvent) GetInside() bool {
	if m != nil {
		return m.Inside
	}
	return false
}

func (m *ButtonEvent) GetKind() EventKind {
	if m != nil {
		return m.Kind
	}
	return EventKind_EVENT_KIND_POSSIBLE
}

type TapRecognizer struct {
	Count          int64 `protobuf:"varint,1,opt,name=count" json:"count,omitempty"`
	RecognizedFunc int64 `protobuf:"varint,2,opt,name=recognizedFunc" json:"recognizedFunc,omitempty"`
}

func (m *TapRecognizer) Reset()                    { *m = TapRecognizer{} }
func (m *TapRecognizer) String() string            { return proto.CompactTextString(m) }
func (*TapRecognizer) ProtoMessage()               {}
func (*TapRecognizer) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{4} }

func (m *TapRecognizer) GetCount() int64 {
	if m != nil {
		return m.Count
	}
	return 0
}

func (m *TapRecognizer) GetRecognizedFunc() int64 {
	if m != nil {
		return m.RecognizedFunc
	}
	return 0
}

type TapEvent struct {
	Timestamp *google_protobuf2.Timestamp `protobuf:"bytes,1,opt,name=timestamp" json:"timestamp,omitempty"`
	Position  *matcha_layout.Point        `protobuf:"bytes,2,opt,name=position" json:"position,omitempty"`
	Kind      EventKind                   `protobuf:"varint,3,opt,name=kind,enum=matcha.touch.EventKind" json:"kind,omitempty"`
}

func (m *TapEvent) Reset()                    { *m = TapEvent{} }
func (m *TapEvent) String() string            { return proto.CompactTextString(m) }
func (*TapEvent) ProtoMessage()               {}
func (*TapEvent) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{5} }

func (m *TapEvent) GetTimestamp() *google_protobuf2.Timestamp {
	if m != nil {
		return m.Timestamp
	}
	return nil
}

func (m *TapEvent) GetPosition() *matcha_layout.Point {
	if m != nil {
		return m.Position
	}
	return nil
}

func (m *TapEvent) GetKind() EventKind {
	if m != nil {
		return m.Kind
	}
	return EventKind_EVENT_KIND_POSSIBLE
}

type PressRecognizer struct {
	MinDuration *google_protobuf1.Duration `protobuf:"bytes,1,opt,name=minDuration" json:"minDuration,omitempty"`
	FuncId      int64                      `protobuf:"varint,2,opt,name=funcId" json:"funcId,omitempty"`
}

func (m *PressRecognizer) Reset()                    { *m = PressRecognizer{} }
func (m *PressRecognizer) String() string            { return proto.CompactTextString(m) }
func (*PressRecognizer) ProtoMessage()               {}
func (*PressRecognizer) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{6} }

func (m *PressRecognizer) GetMinDuration() *google_protobuf1.Duration {
	if m != nil {
		return m.MinDuration
	}
	return nil
}

func (m *PressRecognizer) GetFuncId() int64 {
	if m != nil {
		return m.FuncId
	}
	return 0
}

type PressEvent struct {
	Timestamp *google_protobuf2.Timestamp `protobuf:"bytes,1,opt,name=timestamp" json:"timestamp,omitempty"`
	Position  *matcha_layout.Point        `protobuf:"bytes,2,opt,name=position" json:"position,omitempty"`
	Kind      EventKind                   `protobuf:"varint,3,opt,name=kind,enum=matcha.touch.EventKind" json:"kind,omitempty"`
	Duration  *google_protobuf1.Duration  `protobuf:"bytes,4,opt,name=duration" json:"duration,omitempty"`
}

func (m *PressEvent) Reset()                    { *m = PressEvent{} }
func (m *PressEvent) String() string            { return proto.CompactTextString(m) }
func (*PressEvent) ProtoMessage()               {}
func (*PressEvent) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{7} }

func (m *PressEvent) GetTimestamp() *google_protobuf2.Timestamp {
	if m != nil {
		return m.Timestamp
	}
	return nil
}

func (m *PressEvent) GetPosition() *matcha_layout.Point {
	if m != nil {
		return m.Position
	}
	return nil
}

func (m *PressEvent) GetKind() EventKind {
	if m != nil {
		return m.Kind
	}
	return EventKind_EVENT_KIND_POSSIBLE
}

func (m *PressEvent) GetDuration() *google_protobuf1.Duration {
	if m != nil {
		return m.Duration
	}
	return nil
}

func init() {
	proto.RegisterType((*Recognizer)(nil), "matcha.touch.Recognizer")
	proto.RegisterType((*RecognizerList)(nil), "matcha.touch.RecognizerList")
	proto.RegisterType((*ButtonRecognizer)(nil), "matcha.touch.ButtonRecognizer")
	proto.RegisterType((*ButtonEvent)(nil), "matcha.touch.ButtonEvent")
	proto.RegisterType((*TapRecognizer)(nil), "matcha.touch.TapRecognizer")
	proto.RegisterType((*TapEvent)(nil), "matcha.touch.TapEvent")
	proto.RegisterType((*PressRecognizer)(nil), "matcha.touch.PressRecognizer")
	proto.RegisterType((*PressEvent)(nil), "matcha.touch.PressEvent")
	proto.RegisterEnum("matcha.touch.EventKind", EventKind_name, EventKind_value)
}

func init() { proto.RegisterFile("gomatcha.io/matcha/pb/touch/touch2.proto", fileDescriptor0) }

var fileDescriptor0 = []byte{
	// 572 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xcc, 0x94, 0x6d, 0x8f, 0xd2, 0x40,
	0x10, 0xc7, 0x2d, 0xbd, 0x07, 0x6e, 0x2a, 0x88, 0xeb, 0x3d, 0x14, 0x4c, 0x94, 0x34, 0xc6, 0x54,
	0x4d, 0x8a, 0x41, 0x4d, 0x8c, 0xc6, 0x17, 0x70, 0xf4, 0x4e, 0x72, 0x1c, 0x47, 0x16, 0xe2, 0x8b,
	0x7b, 0x73, 0x29, 0x6d, 0xe1, 0x36, 0xc2, 0x6e, 0xd3, 0x6e, 0x4d, 0xf0, 0x33, 0xf8, 0x29, 0xf4,
	0x6b, 0xf9, 0x61, 0x0c, 0xdb, 0xa5, 0xec, 0x71, 0xc6, 0x98, 0xf8, 0xc6, 0x37, 0xb4, 0x33, 0xf3,
	0xdb, 0x99, 0xf9, 0xcf, 0x0e, 0x05, 0x7b, 0xca, 0xe6, 0x1e, 0xf7, 0xaf, 0x3d, 0x87, 0xb0, 0x46,
	0xf6, 0xd6, 0x88, 0xc6, 0x0d, 0xce, 0x52, 0xff, 0x3a, 0xfb, 0x6d, 0x3a, 0x51, 0xcc, 0x38, 0x43,
	0x77, 0x25, 0x27, 0x9c, 0xb5, 0xea, 0x94, 0xb1, 0xe9, 0x2c, 0x6c, 0x88, 0xd8, 0x38, 0x9d, 0x34,
	0x3c, 0xba, 0xc8, 0xc0, 0xda, 0xa3, 0xcd, 0x50, 0x90, 0xc6, 0x1e, 0x27, 0x8c, 0xca, 0xf8, 0xe3,
	0xcd, 0x38, 0x27, 0xf3, 0x30, 0xe1, 0xde, 0x3c, 0x92, 0xc0, 0xb3, 0xdf, 0xf7, 0x34, 0xf3, 0x16,
	0x2c, 0xe5, 0xf2, 0x91, 0xa1, 0x16, 0x06, 0xc0, 0xa1, 0xcf, 0xa6, 0x94, 0x7c, 0x0d, 0x63, 0x54,
	0x86, 0x02, 0x09, 0x4c, 0xad, 0xae, 0xd9, 0x3a, 0x2e, 0x90, 0x00, 0xbd, 0x06, 0x88, 0xf3, 0xa8,
	0xa9, 0xd7, 0x35, 0xdb, 0x68, 0xee, 0x3b, 0x59, 0x79, 0x67, 0x55, 0xde, 0x69, 0xd1, 0x05, 0x56,
	0x38, 0xab, 0x07, 0xe5, 0x75, 0xce, 0x1e, 0x49, 0x38, 0x7a, 0x07, 0xc6, 0x3a, 0x9e, 0x98, 0x5a,
	0x5d, 0xb7, 0x8d, 0xa6, 0xe9, 0xa8, 0x03, 0x71, 0xd6, 0x47, 0xb0, 0x0a, 0x5b, 0x18, 0x2a, 0xed,
	0x94, 0x73, 0x46, 0x95, 0x3e, 0x4d, 0xd8, 0x65, 0xd4, 0xfd, 0x12, 0x52, 0x2e, 0x9b, 0x5d, 0x99,
	0xe8, 0x09, 0x94, 0xc8, 0x94, 0xb2, 0x38, 0x4c, 0x86, 0x7e, 0xcc, 0x66, 0x33, 0xb3, 0x50, 0xd7,
	0xec, 0x22, 0xbe, 0xe9, 0xb4, 0xbe, 0x69, 0x60, 0x64, 0x49, 0xb3, 0x53, 0x6f, 0x61, 0x2f, 0x9f,
	0xa1, 0xc8, 0x68, 0x34, 0x6b, 0xb7, 0x64, 0x8e, 0x56, 0x04, 0x5e, 0xc3, 0xe8, 0x10, 0x76, 0x08,
	0x4d, 0x48, 0x10, 0x8a, 0xe9, 0x14, 0xb1, 0xb4, 0xd0, 0x0b, 0xd8, 0xfa, 0x4c, 0x68, 0x60, 0x6e,
	0xd5, 0x35, 0xbb, 0xdc, 0x3c, 0xba, 0x29, 0x55, 0x14, 0x3d, 0x23, 0x34, 0xc0, 0x02, 0xb2, 0xce,
	0xa1, 0x34, 0xf2, 0x22, 0x45, 0xdf, 0x3e, 0x6c, 0xfb, 0x2c, 0xcd, 0xd5, 0x65, 0x06, 0x7a, 0x0a,
	0xe5, 0x7c, 0x30, 0xc1, 0x49, 0x4a, 0x7d, 0x21, 0x4e, 0xc7, 0x1b, 0x5e, 0xeb, 0x87, 0x06, 0xc5,
	0x91, 0x17, 0xfd, 0xab, 0xb4, 0x97, 0x50, 0x8c, 0x58, 0x42, 0x96, 0x8b, 0x27, 0x0a, 0x2d, 0xaf,
	0x5e, 0xca, 0x90, 0x2b, 0x34, 0x60, 0x84, 0x72, 0x9c, 0x53, 0xb9, 0x68, 0xfd, 0x6f, 0x44, 0x4f,
	0xe0, 0xde, 0x20, 0x0e, 0x93, 0x44, 0x91, 0xfd, 0x1e, 0x8c, 0x39, 0xa1, 0x1d, 0xb9, 0xed, 0xb2,
	0xdb, 0xea, 0xad, 0x6e, 0x57, 0x00, 0x56, 0xe9, 0xe5, 0x4d, 0x4c, 0x52, 0xea, 0x77, 0x03, 0x39,
	0x15, 0x69, 0x59, 0x3f, 0x35, 0x00, 0x51, 0xe8, 0xff, 0x9e, 0x07, 0x7a, 0x03, 0xc5, 0xd5, 0xff,
	0x5c, 0x6c, 0xcd, 0x1f, 0x95, 0xe7, 0xe8, 0x73, 0x0a, 0x7b, 0x79, 0x26, 0x74, 0x04, 0x0f, 0xdc,
	0x4f, 0x6e, 0x7f, 0x74, 0x75, 0xd6, 0xed, 0x77, 0xae, 0x06, 0x17, 0xc3, 0x61, 0xb7, 0xdd, 0x73,
	0x2b, 0x77, 0xd0, 0x21, 0x20, 0x25, 0x70, 0xfc, 0xb1, 0xd5, 0x3f, 0x75, 0x3b, 0x15, 0x0d, 0x1d,
	0xc0, 0x7d, 0xc5, 0x7f, 0xd2, 0xea, 0xf6, 0xdc, 0x4e, 0xa5, 0x80, 0xaa, 0x70, 0xa0, 0xb8, 0xb1,
	0x7b, 0x7c, 0x71, 0xda, 0xef, 0x5e, 0xba, 0x9d, 0x8a, 0xde, 0xfe, 0x00, 0x0f, 0x09, 0x73, 0xf2,
	0x0f, 0x8c, 0x7c, 0x44, 0xe3, 0x4c, 0x55, 0x7b, 0x77, 0x30, 0x1e, 0x2d, 0x5f, 0x2e, 0xb7, 0x85,
	0xfd, 0xbd, 0x50, 0x3a, 0x17, 0xc4, 0xa0, 0x2d, 0xdc, 0xe3, 0x1d, 0xa1, 0xe5, 0xd5, 0xaf, 0x00,
	0x00, 0x00, 0xff, 0xff, 0x3e, 0xac, 0x40, 0xde, 0x37, 0x05, 0x00, 0x00,
}
