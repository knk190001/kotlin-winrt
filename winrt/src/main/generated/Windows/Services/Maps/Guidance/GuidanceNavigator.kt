package Windows.Services.Maps.Guidance

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(GuidanceNavigator.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceNavigator;{08f17ef7-8e3f-4d9a-be8a-108f9a012c67})")
@WinRTByReference(brClass = GuidanceNavigator.ByReference::class)
public class GuidanceNavigator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceNavigator.WithDefault, IGuidanceNavigator2.WithDefault, IWinRTObject
    {
  private val __1988824416_Interface: IGuidanceNavigator.WithDefault by lazy {
    as_1988824416()
  }


  private val __1524014802_Interface: IGuidanceNavigator2.WithDefault by lazy {
    as_1524014802()
  }


  public override val __1988824416_Ptr: JNAPointer? by lazy {
    __1988824416_Interface.__1988824416_Ptr
  }


  public override val __1524014802_Ptr: JNAPointer? by lazy {
    __1524014802_Interface.__1524014802_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1988824416_Interface, __1524014802_Interface)

  private fun as_1988824416(): IGuidanceNavigator.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceNavigator.ABI.makeIGuidanceNavigator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceNavigator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceNavigator.ABI.makeIGuidanceNavigator(ref.value))
  }

  private fun as_1524014802(): IGuidanceNavigator2.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceNavigator2.ABI.makeIGuidanceNavigator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceNavigator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceNavigator2.ABI.makeIGuidanceNavigator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceNavigator> {
    public override fun getValue() = GuidanceNavigator(pointer.getPointer(0))

    public fun setValue(value: GuidanceNavigator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceNavigator, MemoryAddress> {
    public val IGuidanceNavigatorStatics_Instance: IGuidanceNavigatorStatics by lazy {
      createIGuidanceNavigatorStatics()
    }


    public val IGuidanceNavigatorStatics2_Instance: IGuidanceNavigatorStatics2 by lazy {
      createIGuidanceNavigatorStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGuidanceNavigatorStatics(): IGuidanceNavigatorStatics {
      val refiid = Guid.REFIID(IGuidanceNavigatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.Guidance.GuidanceNavigator".toHandle(),refiid,interfacePtr)
      val result = IGuidanceNavigatorStatics.ABI.makeIGuidanceNavigatorStatics(interfacePtr.value)
      return result
    }

    public fun createIGuidanceNavigatorStatics2(): IGuidanceNavigatorStatics2 {
      val refiid = Guid.REFIID(IGuidanceNavigatorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.Guidance.GuidanceNavigator".toHandle(),refiid,interfacePtr)
      val result = IGuidanceNavigatorStatics2.ABI.makeIGuidanceNavigatorStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GuidanceNavigator {
      val address = segment.toRawLongValue()
      return GuidanceNavigator(Pointer(address))
    }

    public override fun toNative(obj: GuidanceNavigator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrent() = ABI.IGuidanceNavigatorStatics_Instance.GetCurrent()

    public fun get_UseAppProvidedVoice() =
        ABI.IGuidanceNavigatorStatics2_Instance.get_UseAppProvidedVoice()
  }
}
