package Microsoft.UI.Xaml

import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(DurationHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DurationHelper;{cc1089ab-8041-5c3e-b753-8397e7358cc6})")
@WinRTByReference(brClass = DurationHelper.ByReference::class)
public class DurationHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDurationHelper.WithDefault, IWinRTObject {
  private val __720566889_Interface: IDurationHelper.WithDefault by lazy {
    as_720566889()
  }


  public override val __720566889_Ptr: JNAPointer? by lazy {
    __720566889_Interface.__720566889_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__720566889_Interface)

  private fun as_720566889(): IDurationHelper.WithDefault {
    if(pointer == NULL) {
      return(IDurationHelper.ABI.makeIDurationHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDurationHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDurationHelper.ABI.makeIDurationHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DurationHelper>
      {
    public override fun getValue() = DurationHelper(pointer.getPointer(0))

    public fun setValue(value: DurationHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DurationHelper, MemoryAddress> {
    public val IDurationHelperStatics_Instance: IDurationHelperStatics by lazy {
      createIDurationHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDurationHelperStatics(): IDurationHelperStatics {
      val refiid = Guid.REFIID(IDurationHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DurationHelper".toHandle(),refiid,interfacePtr)
      val result = IDurationHelperStatics.ABI.makeIDurationHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DurationHelper {
      val address = segment.toRawLongValue()
      return DurationHelper(Pointer(address))
    }

    public override fun toNative(obj: DurationHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Automatic() = ABI.IDurationHelperStatics_Instance.get_Automatic()

    public fun get_Forever() = ABI.IDurationHelperStatics_Instance.get_Forever()

    public fun Compare(duration1: Duration, duration2: Duration) =
        ABI.IDurationHelperStatics_Instance.Compare(duration1, duration2)

    public fun FromTimeSpan(timeSpan: TimeSpan) =
        ABI.IDurationHelperStatics_Instance.FromTimeSpan(timeSpan)

    public fun GetHasTimeSpan(target: Duration) =
        ABI.IDurationHelperStatics_Instance.GetHasTimeSpan(target)

    public fun Add(target: Duration, duration: Duration) =
        ABI.IDurationHelperStatics_Instance.Add(target, duration)

    public fun Equals(target: Duration, value: Duration) =
        ABI.IDurationHelperStatics_Instance.Equals(target, value)

    public fun Subtract(target: Duration, duration: Duration) =
        ABI.IDurationHelperStatics_Instance.Subtract(target, duration)
  }
}
