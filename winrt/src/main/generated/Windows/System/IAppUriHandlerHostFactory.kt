package Windows.System

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppUriHandlerHostFactory.ABI::class)
@Signature("{257c3c96-ce04-5f98-96bb-3ebd3e9275bb}")
@Guid("257c3c96ce045f9896bb3ebd3e9275bb")
@WinRTInterface("257c3c96ce045f9896bb3ebd3e9275bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerHostFactory.ByReference::class)
public interface IAppUriHandlerHostFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(name: String?): AppUriHandlerHost?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerHostFactory> {
    public override fun getValue() = ABI.makeIAppUriHandlerHostFactory(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerHostFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerHostFactory {
    public val __1038455282_Ptr: Pointer?

    public val _1038455282_VtblPtr: Pointer?
      get() = __1038455282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(name: String?): AppUriHandlerHost? {
      val fnPtr = _1038455282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppUriHandlerHost>()
      val hr = fn.invokeHR(arrayOf(__1038455282_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppUriHandlerHost>(result.getValue())
      return resultValue
    }
  }

  public class IAppUriHandlerHostFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1038455282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerHostFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("257c3c96ce045f9896bb3ebd3e9275bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerHostFactory(ptr: Pointer?): WithDefault =
        IAppUriHandlerHostFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUriHandlerHostFactory {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerHostFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerHostFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1038455282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerHostFactory):
        Array<IAppUriHandlerHostFactory?> = (elements as
        Array<IAppUriHandlerHostFactory?>).castToImpl<IAppUriHandlerHostFactory,IAppUriHandlerHostFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerHostFactory?> =
        arrayOfNulls<IAppUriHandlerHostFactory_Impl>(size) as Array<IAppUriHandlerHostFactory?>
  }
}
