package Windows.Security.Isolation

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIsolatedWindowsEnvironmentShareFileRequestOptions.ABI::class)
@Signature("{c9190ed8-0fd0-4946-bb88-117a60737b61}")
@Guid("c9190ed80fd04946bb88117a60737b61")
@WinRTInterface("c9190ed80fd04946bb88117a60737b61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentShareFileRequestOptions.ByReference::class)
public interface IIsolatedWindowsEnvironmentShareFileRequestOptions : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_AllowWrite(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowWrite(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentShareFileRequestOptions> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentShareFileRequestOptions(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentShareFileRequestOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentShareFileRequestOptions {
    public val __1538365987_Ptr: Pointer?

    public val _1538365987_VtblPtr: Pointer?
      get() = __1538365987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowWrite(): Boolean {
      val fnPtr = _1538365987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1538365987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowWrite(value: Boolean): Unit {
      val fnPtr = _1538365987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1538365987_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironmentShareFileRequestOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1538365987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentShareFileRequestOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9190ed80fd04946bb88117a60737b61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentShareFileRequestOptions(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentShareFileRequestOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentShareFileRequestOptions {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentShareFileRequestOptions(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentShareFileRequestOptions):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1538365987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentShareFileRequestOptions):
        Array<IIsolatedWindowsEnvironmentShareFileRequestOptions?> = (elements as
        Array<IIsolatedWindowsEnvironmentShareFileRequestOptions?>).castToImpl<IIsolatedWindowsEnvironmentShareFileRequestOptions,IIsolatedWindowsEnvironmentShareFileRequestOptions_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IIsolatedWindowsEnvironmentShareFileRequestOptions?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentShareFileRequestOptions_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentShareFileRequestOptions?>
  }
}
