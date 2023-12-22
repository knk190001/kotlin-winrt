package Microsoft.UI.Xaml.Automation

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

@ABIMarker(RangeValuePatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.RangeValuePatternIdentifiers;{c114db37-6a75-5ef1-a542-d3b13f92cbfe})")
@WinRTByReference(brClass = RangeValuePatternIdentifiers.ByReference::class)
public class RangeValuePatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRangeValuePatternIdentifiers.WithDefault, IWinRTObject {
  private val __817555988_Interface: IRangeValuePatternIdentifiers.WithDefault by lazy {
    as_817555988()
  }


  public override val __817555988_Ptr: JNAPointer? by lazy {
    __817555988_Interface.__817555988_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__817555988_Interface)

  private fun as_817555988(): IRangeValuePatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IRangeValuePatternIdentifiers.ABI.makeIRangeValuePatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRangeValuePatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRangeValuePatternIdentifiers.ABI.makeIRangeValuePatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RangeValuePatternIdentifiers> {
    public override fun getValue() = RangeValuePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: RangeValuePatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RangeValuePatternIdentifiers, MemoryAddress> {
    public val IRangeValuePatternIdentifiersStatics_Instance: IRangeValuePatternIdentifiersStatics
        by lazy {
      createIRangeValuePatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRangeValuePatternIdentifiersStatics(): IRangeValuePatternIdentifiersStatics {
      val refiid = Guid.REFIID(IRangeValuePatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.RangeValuePatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IRangeValuePatternIdentifiersStatics.ABI.makeIRangeValuePatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RangeValuePatternIdentifiers {
      val address = segment.toRawLongValue()
      return RangeValuePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: RangeValuePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsReadOnlyProperty() =
        ABI.IRangeValuePatternIdentifiersStatics_Instance.get_IsReadOnlyProperty()

    public fun get_LargeChangeProperty() =
        ABI.IRangeValuePatternIdentifiersStatics_Instance.get_LargeChangeProperty()

    public fun get_MaximumProperty() =
        ABI.IRangeValuePatternIdentifiersStatics_Instance.get_MaximumProperty()

    public fun get_MinimumProperty() =
        ABI.IRangeValuePatternIdentifiersStatics_Instance.get_MinimumProperty()

    public fun get_SmallChangeProperty() =
        ABI.IRangeValuePatternIdentifiersStatics_Instance.get_SmallChangeProperty()

    public fun get_ValueProperty() =
        ABI.IRangeValuePatternIdentifiersStatics_Instance.get_ValueProperty()
  }
}
