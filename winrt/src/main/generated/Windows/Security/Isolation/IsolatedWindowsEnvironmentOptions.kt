package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentOptions.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentOptions;{b71d98f7-61f0-4008-b207-0bf9eb2d76f2})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentOptions.ByReference::class)
public class IsolatedWindowsEnvironmentOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentOptions.WithDefault,
    IIsolatedWindowsEnvironmentOptions2.WithDefault, IWinRTObject {
  private val __1044526377_Interface: IIsolatedWindowsEnvironmentOptions.WithDefault by lazy {
    as_1044526377()
  }


  private val __1979420731_Interface: IIsolatedWindowsEnvironmentOptions2.WithDefault by lazy {
    as_1979420731()
  }


  public override val __1044526377_Ptr: JNAPointer? by lazy {
    __1044526377_Interface.__1044526377_Ptr
  }


  public override val __1979420731_Ptr: JNAPointer? by lazy {
    __1979420731_Interface.__1979420731_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1044526377_Interface, __1979420731_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1044526377(): IIsolatedWindowsEnvironmentOptions.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentOptions.ABI.makeIIsolatedWindowsEnvironmentOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentOptions.ABI.makeIIsolatedWindowsEnvironmentOptions(ref.value))
  }

  private fun as_1979420731(): IIsolatedWindowsEnvironmentOptions2.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentOptions2.ABI.makeIIsolatedWindowsEnvironmentOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentOptions2.ABI.makeIIsolatedWindowsEnvironmentOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentOptions> {
    public override fun getValue() = IsolatedWindowsEnvironmentOptions(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironmentOptions {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentOptions(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
