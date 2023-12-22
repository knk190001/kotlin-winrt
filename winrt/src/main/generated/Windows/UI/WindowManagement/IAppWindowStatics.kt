package Windows.UI.WindowManagement

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppWindowStatics.ABI::class)
@Signature("{ff1f3ea3-b769-50ef-9873-108cd0e89746}")
@Guid("ff1f3ea3b76950ef9873108cd0e89746")
@WinRTInterface("ff1f3ea3b76950ef9873108cd0e89746")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowStatics.ByReference::class)
public interface IAppWindowStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateAsync(): IAsyncOperation<AppWindow?>?

  @InterfaceMethod(1)
  public fun ClearAllPersistedState(): Unit

  @InterfaceMethod(2)
  public fun ClearPersistedState(key: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowStatics> {
    public override fun getValue() = ABI.makeIAppWindowStatics(pointer.getPointer(0))

    public fun setValue(value: IAppWindowStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowStatics {
    public val __1564310331_Ptr: Pointer?

    public val _1564310331_VtblPtr: Pointer?
      get() = __1564310331_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateAsync(): IAsyncOperation<AppWindow?>? {
      val fnPtr = _1564310331_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppWindow?>>()
      val hr = fn.invokeHR(arrayOf(__1564310331_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AppWindow?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearAllPersistedState(): Unit {
      val fnPtr = _1564310331_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1564310331_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ClearPersistedState(key: String?): Unit {
      val fnPtr = _1564310331_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1564310331_Ptr, marshalToNative(key),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindowStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1564310331_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff1f3ea3b76950ef9873108cd0e89746")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowStatics(ptr: Pointer?): WithDefault = IAppWindowStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowStatics {
      val address = segment.toRawLongValue()
      return makeIAppWindowStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1564310331_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowStatics): Array<IAppWindowStatics?> = (elements
        as Array<IAppWindowStatics?>).castToImpl<IAppWindowStatics,IAppWindowStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowStatics?> =
        arrayOfNulls<IAppWindowStatics_Impl>(size) as Array<IAppWindowStatics?>
  }
}
