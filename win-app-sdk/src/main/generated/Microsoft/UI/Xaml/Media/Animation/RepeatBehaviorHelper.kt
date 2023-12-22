package Microsoft.UI.Xaml.Media.Animation

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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RepeatBehaviorHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.RepeatBehaviorHelper;{4643f139-ffef-5c6a-8de6-142b41cd51a5})")
@WinRTByReference(brClass = RepeatBehaviorHelper.ByReference::class)
public class RepeatBehaviorHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRepeatBehaviorHelper.WithDefault, IWinRTObject {
  private val __1936385642_Interface: IRepeatBehaviorHelper.WithDefault by lazy {
    as_1936385642()
  }


  public override val __1936385642_Ptr: JNAPointer? by lazy {
    __1936385642_Interface.__1936385642_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1936385642_Interface)

  private fun as_1936385642(): IRepeatBehaviorHelper.WithDefault {
    if(pointer == NULL) {
      return(IRepeatBehaviorHelper.ABI.makeIRepeatBehaviorHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepeatBehaviorHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepeatBehaviorHelper.ABI.makeIRepeatBehaviorHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RepeatBehaviorHelper> {
    public override fun getValue() = RepeatBehaviorHelper(pointer.getPointer(0))

    public fun setValue(value: RepeatBehaviorHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepeatBehaviorHelper, MemoryAddress> {
    public val IRepeatBehaviorHelperStatics_Instance: IRepeatBehaviorHelperStatics by lazy {
      createIRepeatBehaviorHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRepeatBehaviorHelperStatics(): IRepeatBehaviorHelperStatics {
      val refiid = Guid.REFIID(IRepeatBehaviorHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.RepeatBehaviorHelper".toHandle(),refiid,interfacePtr)
      val result =
          IRepeatBehaviorHelperStatics.ABI.makeIRepeatBehaviorHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RepeatBehaviorHelper {
      val address = segment.toRawLongValue()
      return RepeatBehaviorHelper(Pointer(address))
    }

    public override fun toNative(obj: RepeatBehaviorHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Forever() = ABI.IRepeatBehaviorHelperStatics_Instance.get_Forever()

    public fun FromCount(count: Double) = ABI.IRepeatBehaviorHelperStatics_Instance.FromCount(count)

    public fun FromDuration(duration: TimeSpan) =
        ABI.IRepeatBehaviorHelperStatics_Instance.FromDuration(duration)

    public fun GetHasCount(target: RepeatBehavior) =
        ABI.IRepeatBehaviorHelperStatics_Instance.GetHasCount(target)

    public fun GetHasDuration(target: RepeatBehavior) =
        ABI.IRepeatBehaviorHelperStatics_Instance.GetHasDuration(target)

    public fun Equals(target: RepeatBehavior, value: RepeatBehavior) =
        ABI.IRepeatBehaviorHelperStatics_Instance.Equals(target, value)
  }
}
