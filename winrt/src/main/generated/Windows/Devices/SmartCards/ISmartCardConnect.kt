package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardConnect.ABI::class)
@Signature("{2fdf87e5-028d-491e-a058-3382c3986f40}")
@Guid("2fdf87e5028d491ea0583382c3986f40")
@WinRTInterface("2fdf87e5028d491ea0583382c3986f40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardConnect.ByReference::class)
public interface ISmartCardConnect : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ConnectAsync(): IAsyncOperation<SmartCardConnection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardConnect> {
    public override fun getValue() = ABI.makeISmartCardConnect(pointer.getPointer(0))

    public fun setValue(value: ISmartCardConnect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardConnect {
    public val __2050881764_Ptr: Pointer?

    public val _2050881764_VtblPtr: Pointer?
      get() = __2050881764_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConnectAsync(): IAsyncOperation<SmartCardConnection?>? {
      val fnPtr = _2050881764_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardConnection?>>()
      val hr = fn.invokeHR(arrayOf(__2050881764_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SmartCardConnection?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardConnect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2050881764_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardConnect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2fdf87e5028d491ea0583382c3986f40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardConnect(ptr: Pointer?): WithDefault = ISmartCardConnect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardConnect {
      val address = segment.toRawLongValue()
      return makeISmartCardConnect(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardConnect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2050881764_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardConnect): Array<ISmartCardConnect?> = (elements
        as Array<ISmartCardConnect?>).castToImpl<ISmartCardConnect,ISmartCardConnect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardConnect?> =
        arrayOfNulls<ISmartCardConnect_Impl>(size) as Array<ISmartCardConnect?>
  }
}
