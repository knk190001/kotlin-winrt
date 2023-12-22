package Windows.Media.Capture.Core

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

@ABIMarker(VariablePhotoSequenceCapture.ABI::class)
@Signature("rc(Windows.Media.Capture.Core.VariablePhotoSequenceCapture;{d0112d1d-031e-4041-a6d6-bd742476a8ee})")
@WinRTByReference(brClass = VariablePhotoSequenceCapture.ByReference::class)
public class VariablePhotoSequenceCapture(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVariablePhotoSequenceCapture.WithDefault,
    IVariablePhotoSequenceCapture2.WithDefault, IWinRTObject {
  private val __369240540_Interface: IVariablePhotoSequenceCapture.WithDefault by lazy {
    as_369240540()
  }


  private val __1438445098_Interface: IVariablePhotoSequenceCapture2.WithDefault by lazy {
    as_1438445098()
  }


  public override val __369240540_Ptr: JNAPointer? by lazy {
    __369240540_Interface.__369240540_Ptr
  }


  public override val __1438445098_Ptr: JNAPointer? by lazy {
    __1438445098_Interface.__1438445098_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__369240540_Interface, __1438445098_Interface)

  private fun as_369240540(): IVariablePhotoSequenceCapture.WithDefault {
    if(pointer == NULL) {
      return(IVariablePhotoSequenceCapture.ABI.makeIVariablePhotoSequenceCapture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVariablePhotoSequenceCapture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVariablePhotoSequenceCapture.ABI.makeIVariablePhotoSequenceCapture(ref.value))
  }

  private fun as_1438445098(): IVariablePhotoSequenceCapture2.WithDefault {
    if(pointer == NULL) {
      return(IVariablePhotoSequenceCapture2.ABI.makeIVariablePhotoSequenceCapture2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVariablePhotoSequenceCapture2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVariablePhotoSequenceCapture2.ABI.makeIVariablePhotoSequenceCapture2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VariablePhotoSequenceCapture> {
    public override fun getValue() = VariablePhotoSequenceCapture(pointer.getPointer(0))

    public fun setValue(value: VariablePhotoSequenceCapture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VariablePhotoSequenceCapture, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VariablePhotoSequenceCapture {
      val address = segment.toRawLongValue()
      return VariablePhotoSequenceCapture(Pointer(address))
    }

    public override fun toNative(obj: VariablePhotoSequenceCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
