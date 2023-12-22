package Microsoft.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DrillInNavigationTransitionInfo.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.DrillInNavigationTransitionInfo;{5d5863d6-4bbf-5b30-94fa-034531cfa2aa})")
@WinRTByReference(brClass = DrillInNavigationTransitionInfo.ByReference::class)
public class DrillInNavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : NavigationTransitionInfo(ptr), IDrillInNavigationTransitionInfo.WithDefault, IWinRTObject {
  private val __1509131388_Interface: IDrillInNavigationTransitionInfo.WithDefault by lazy {
    as_1509131388()
  }


  public override val __1509131388_Ptr: JNAPointer? by lazy {
    __1509131388_Interface.__1509131388_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1509131388_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1509131388(): IDrillInNavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(IDrillInNavigationTransitionInfo.ABI.makeIDrillInNavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDrillInNavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDrillInNavigationTransitionInfo.ABI.makeIDrillInNavigationTransitionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DrillInNavigationTransitionInfo> {
    public override fun getValue() = DrillInNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: DrillInNavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DrillInNavigationTransitionInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.DrillInNavigationTransitionInfo".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): DrillInNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return DrillInNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: DrillInNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
