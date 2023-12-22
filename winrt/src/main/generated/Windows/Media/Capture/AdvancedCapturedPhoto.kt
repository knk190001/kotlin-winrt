package Windows.Media.Capture

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

@ABIMarker(AdvancedCapturedPhoto.ABI::class)
@Signature("rc(Windows.Media.Capture.AdvancedCapturedPhoto;{f072728b-b292-4491-9d41-99807a550bbf})")
@WinRTByReference(brClass = AdvancedCapturedPhoto.ByReference::class)
public class AdvancedCapturedPhoto(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdvancedCapturedPhoto.WithDefault, IAdvancedCapturedPhoto2.WithDefault,
    IWinRTObject {
  private val __610740506_Interface: IAdvancedCapturedPhoto.WithDefault by lazy {
    as_610740506()
  }


  private val __1753086552_Interface: IAdvancedCapturedPhoto2.WithDefault by lazy {
    as_1753086552()
  }


  public override val __610740506_Ptr: JNAPointer? by lazy {
    __610740506_Interface.__610740506_Ptr
  }


  public override val __1753086552_Ptr: JNAPointer? by lazy {
    __1753086552_Interface.__1753086552_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__610740506_Interface, __1753086552_Interface)

  private fun as_610740506(): IAdvancedCapturedPhoto.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedCapturedPhoto.ABI.makeIAdvancedCapturedPhoto(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedCapturedPhoto>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedCapturedPhoto.ABI.makeIAdvancedCapturedPhoto(ref.value))
  }

  private fun as_1753086552(): IAdvancedCapturedPhoto2.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedCapturedPhoto2.ABI.makeIAdvancedCapturedPhoto2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedCapturedPhoto2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedCapturedPhoto2.ABI.makeIAdvancedCapturedPhoto2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdvancedCapturedPhoto> {
    public override fun getValue() = AdvancedCapturedPhoto(pointer.getPointer(0))

    public fun setValue(value: AdvancedCapturedPhoto): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdvancedCapturedPhoto, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdvancedCapturedPhoto {
      val address = segment.toRawLongValue()
      return AdvancedCapturedPhoto(Pointer(address))
    }

    public override fun toNative(obj: AdvancedCapturedPhoto): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
