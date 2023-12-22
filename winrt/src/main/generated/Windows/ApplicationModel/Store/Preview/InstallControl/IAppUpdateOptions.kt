package Windows.ApplicationModel.Store.Preview.InstallControl

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppUpdateOptions.ABI::class)
@Signature("{26f0b02f-c2f3-4aea-af8c-6308dd9db85f}")
@Guid("26f0b02fc2f34aeaaf8c6308dd9db85f")
@WinRTInterface("26f0b02fc2f34aeaaf8c6308dd9db85f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUpdateOptions.ByReference::class)
public interface IAppUpdateOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CatalogId(): String?

  @InterfaceMethod(1)
  public fun put_CatalogId(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AllowForcedAppRestart(): Boolean

  @InterfaceMethod(3)
  public fun put_AllowForcedAppRestart(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUpdateOptions> {
    public override fun getValue() = ABI.makeIAppUpdateOptions(pointer.getPointer(0))

    public fun setValue(value: IAppUpdateOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUpdateOptions {
    public val __719815330_Ptr: Pointer?

    public val _719815330_VtblPtr: Pointer?
      get() = __719815330_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CatalogId(): String? {
      val fnPtr = _719815330_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__719815330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CatalogId(value: String?): Unit {
      val fnPtr = _719815330_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__719815330_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AllowForcedAppRestart(): Boolean {
      val fnPtr = _719815330_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__719815330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AllowForcedAppRestart(value: Boolean): Unit {
      val fnPtr = _719815330_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__719815330_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppUpdateOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __719815330_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUpdateOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26f0b02fc2f34aeaaf8c6308dd9db85f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUpdateOptions(ptr: Pointer?): WithDefault = IAppUpdateOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUpdateOptions {
      val address = segment.toRawLongValue()
      return makeIAppUpdateOptions(Pointer(address))
    }

    public override fun toNative(obj: IAppUpdateOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__719815330_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUpdateOptions): Array<IAppUpdateOptions?> = (elements
        as Array<IAppUpdateOptions?>).castToImpl<IAppUpdateOptions,IAppUpdateOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUpdateOptions?> =
        arrayOfNulls<IAppUpdateOptions_Impl>(size) as Array<IAppUpdateOptions?>
  }
}
