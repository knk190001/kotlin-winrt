package Windows.Storage

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

@ABIMarker(SetVersionDeferral.ABI::class)
@Signature("rc(Windows.Storage.SetVersionDeferral;{033508a2-781a-437a-b078-3f32badcfe47})")
@WinRTByReference(brClass = SetVersionDeferral.ByReference::class)
public class SetVersionDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISetVersionDeferral.WithDefault, IWinRTObject {
  private val __2038975494_Interface: ISetVersionDeferral.WithDefault by lazy {
    as_2038975494()
  }


  public override val __2038975494_Ptr: JNAPointer? by lazy {
    __2038975494_Interface.__2038975494_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2038975494_Interface)

  private fun as_2038975494(): ISetVersionDeferral.WithDefault {
    if(pointer == NULL) {
      return(ISetVersionDeferral.ABI.makeISetVersionDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISetVersionDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISetVersionDeferral.ABI.makeISetVersionDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SetVersionDeferral> {
    public override fun getValue() = SetVersionDeferral(pointer.getPointer(0))

    public fun setValue(value: SetVersionDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SetVersionDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SetVersionDeferral {
      val address = segment.toRawLongValue()
      return SetVersionDeferral(Pointer(address))
    }

    public override fun toNative(obj: SetVersionDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
