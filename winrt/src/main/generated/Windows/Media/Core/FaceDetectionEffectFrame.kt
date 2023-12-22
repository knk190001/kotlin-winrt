package Windows.Media.Core

import Windows.Foundation.IClosable
import Windows.Media.IMediaFrame
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FaceDetectionEffectFrame.ABI::class)
@Signature("rc(Windows.Media.Core.FaceDetectionEffectFrame;{8ab08993-5dc8-447b-a247-5270bd802ece})")
@WinRTByReference(brClass = FaceDetectionEffectFrame.ByReference::class)
public class FaceDetectionEffectFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFaceDetectionEffectFrame.WithDefault, IMediaFrame.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __1956510825_Interface: IFaceDetectionEffectFrame.WithDefault by lazy {
    as_1956510825()
  }


  private val __1156286201_Interface: IMediaFrame.WithDefault by lazy {
    as_1156286201()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1956510825_Ptr: JNAPointer? by lazy {
    __1956510825_Interface.__1956510825_Ptr
  }


  public override val __1156286201_Ptr: JNAPointer? by lazy {
    __1156286201_Interface.__1156286201_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1956510825_Interface, __1156286201_Interface, __1260617006_Interface)

  private fun as_1956510825(): IFaceDetectionEffectFrame.WithDefault {
    if(pointer == NULL) {
      return(IFaceDetectionEffectFrame.ABI.makeIFaceDetectionEffectFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFaceDetectionEffectFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFaceDetectionEffectFrame.ABI.makeIFaceDetectionEffectFrame(ref.value))
  }

  private fun as_1156286201(): IMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrame.ABI.makeIMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrame.ABI.makeIMediaFrame(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FaceDetectionEffectFrame> {
    public override fun getValue() = FaceDetectionEffectFrame(pointer.getPointer(0))

    public fun setValue(value: FaceDetectionEffectFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FaceDetectionEffectFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FaceDetectionEffectFrame {
      val address = segment.toRawLongValue()
      return FaceDetectionEffectFrame(Pointer(address))
    }

    public override fun toNative(obj: FaceDetectionEffectFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
