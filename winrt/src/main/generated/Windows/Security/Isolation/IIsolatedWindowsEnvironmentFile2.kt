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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIsolatedWindowsEnvironmentFile2.ABI::class)
@Signature("{4eeb8dec-ad5d-4b0a-b754-f36c3d46d684}")
@Guid("4eeb8decad5d4b0ab754f36c3d46d684")
@WinRTInterface("4eeb8decad5d4b0ab754f36c3d46d684")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentFile2.ByReference::class)
public interface IIsolatedWindowsEnvironmentFile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GuestPath(): String?

  @InterfaceMethod(1)
  public fun get_IsReadOnly(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentFile2> {
    public override fun getValue() = ABI.makeIIsolatedWindowsEnvironmentFile2(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentFile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentFile2 {
    public val __45369169_Ptr: Pointer?

    public val _45369169_VtblPtr: Pointer?
      get() = __45369169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GuestPath(): String? {
      val fnPtr = _45369169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__45369169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _45369169_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__45369169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IIsolatedWindowsEnvironmentFile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __45369169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentFile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4eeb8decad5d4b0ab754f36c3d46d684")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentFile2(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentFile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentFile2 {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentFile2(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentFile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__45369169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentFile2):
        Array<IIsolatedWindowsEnvironmentFile2?> = (elements as
        Array<IIsolatedWindowsEnvironmentFile2?>).castToImpl<IIsolatedWindowsEnvironmentFile2,IIsolatedWindowsEnvironmentFile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentFile2?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentFile2_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentFile2?>
  }
}
