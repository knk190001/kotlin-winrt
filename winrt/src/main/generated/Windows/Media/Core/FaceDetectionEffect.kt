package Windows.Media.Core

import Windows.Media.IMediaExtension
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

@ABIMarker(FaceDetectionEffect.ABI::class)
@Signature("rc(Windows.Media.Core.FaceDetectionEffect;{ae15ebd2-0542-42a9-bc90-f283a29f46c1})")
@WinRTByReference(brClass = FaceDetectionEffect.ByReference::class)
public class FaceDetectionEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFaceDetectionEffect.WithDefault, IMediaExtension.WithDefault, IWinRTObject {
  private val __501431140_Interface: IFaceDetectionEffect.WithDefault by lazy {
    as_501431140()
  }


  private val __9720779_Interface: IMediaExtension.WithDefault by lazy {
    as_9720779()
  }


  public override val __501431140_Ptr: JNAPointer? by lazy {
    __501431140_Interface.__501431140_Ptr
  }


  public override val __9720779_Ptr: JNAPointer? by lazy {
    __9720779_Interface.__9720779_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__501431140_Interface, __9720779_Interface)

  private fun as_501431140(): IFaceDetectionEffect.WithDefault {
    if(pointer == NULL) {
      return(IFaceDetectionEffect.ABI.makeIFaceDetectionEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFaceDetectionEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFaceDetectionEffect.ABI.makeIFaceDetectionEffect(ref.value))
  }

  private fun as_9720779(): IMediaExtension.WithDefault {
    if(pointer == NULL) {
      return(IMediaExtension.ABI.makeIMediaExtension(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaExtension>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaExtension.ABI.makeIMediaExtension(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FaceDetectionEffect> {
    public override fun getValue() = FaceDetectionEffect(pointer.getPointer(0))

    public fun setValue(value: FaceDetectionEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FaceDetectionEffect, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FaceDetectionEffect {
      val address = segment.toRawLongValue()
      return FaceDetectionEffect(Pointer(address))
    }

    public override fun toNative(obj: FaceDetectionEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
