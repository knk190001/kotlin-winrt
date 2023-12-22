package Windows.UI.Input.Inking.Core

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreInkPresenterHost.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Core.CoreInkPresenterHost;{396e89e6-7d55-4617-9e58-68c70c9169b9})")
@WinRTByReference(brClass = CoreInkPresenterHost.ByReference::class)
public class CoreInkPresenterHost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInkPresenterHost.WithDefault, IWinRTObject {
  private val __1349466380_Interface: ICoreInkPresenterHost.WithDefault by lazy {
    as_1349466380()
  }


  public override val __1349466380_Ptr: JNAPointer? by lazy {
    __1349466380_Interface.__1349466380_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1349466380_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1349466380(): ICoreInkPresenterHost.WithDefault {
    if(pointer == NULL) {
      return(ICoreInkPresenterHost.ABI.makeICoreInkPresenterHost(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInkPresenterHost>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInkPresenterHost.ABI.makeICoreInkPresenterHost(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreInkPresenterHost> {
    public override fun getValue() = CoreInkPresenterHost(pointer.getPointer(0))

    public fun setValue(value: CoreInkPresenterHost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreInkPresenterHost, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.Core.CoreInkPresenterHost".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CoreInkPresenterHost {
      val address = segment.toRawLongValue()
      return CoreInkPresenterHost(Pointer(address))
    }

    public override fun toNative(obj: CoreInkPresenterHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
