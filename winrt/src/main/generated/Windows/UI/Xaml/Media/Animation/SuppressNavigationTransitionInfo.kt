package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(SuppressNavigationTransitionInfo.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.SuppressNavigationTransitionInfo;{244d7b0c-b1b7-4871-9d3e-d56203a3a5b4})")
@WinRTByReference(brClass = SuppressNavigationTransitionInfo.ByReference::class)
public class SuppressNavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : NavigationTransitionInfo(ptr), ISuppressNavigationTransitionInfo.WithDefault, IWinRTObject {
  private val __322264910_Interface: ISuppressNavigationTransitionInfo.WithDefault by lazy {
    as_322264910()
  }


  public override val __322264910_Ptr: JNAPointer? by lazy {
    __322264910_Interface.__322264910_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__322264910_Interface)

  public constructor() : this(ABI.activate())

  private fun as_322264910(): ISuppressNavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(ISuppressNavigationTransitionInfo.ABI.makeISuppressNavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISuppressNavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISuppressNavigationTransitionInfo.ABI.makeISuppressNavigationTransitionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SuppressNavigationTransitionInfo> {
    public override fun getValue() = SuppressNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: SuppressNavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SuppressNavigationTransitionInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SuppressNavigationTransitionInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SuppressNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return SuppressNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: SuppressNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
