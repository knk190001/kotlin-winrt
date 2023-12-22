package Windows.UI.Xaml.Controls.Primitives

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlyoutBaseFactory.ABI::class)
@Signature("{1c3363d7-fca7-407e-920e-70e15e9f0bf1}")
@Guid("1c3363d7fca7407e920e70e15e9f0bf1")
@WinRTInterface("1c3363d7fca7407e920e70e15e9f0bf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseFactory.ByReference::class)
public interface IFlyoutBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FlyoutBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseFactory> {
    public override fun getValue() = ABI.makeIFlyoutBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseFactory {
    public val __933187422_Ptr: Pointer?

    public val _933187422_VtblPtr: Pointer?
      get() = __933187422_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FlyoutBase? {
      val fnPtr = _933187422_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__933187422_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __933187422_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c3363d7fca7407e920e70e15e9f0bf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseFactory(ptr: Pointer?): WithDefault = IFlyoutBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseFactory {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__933187422_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseFactory): Array<IFlyoutBaseFactory?> =
        (elements as
        Array<IFlyoutBaseFactory?>).castToImpl<IFlyoutBaseFactory,IFlyoutBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseFactory?> =
        arrayOfNulls<IFlyoutBaseFactory_Impl>(size) as Array<IFlyoutBaseFactory?>
  }
}
