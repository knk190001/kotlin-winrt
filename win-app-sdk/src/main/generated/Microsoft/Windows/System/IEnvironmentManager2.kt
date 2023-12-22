package Microsoft.Windows.System

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

@ABIMarker(IEnvironmentManager2.ABI::class)
@Signature("{cfc0ad51-02b7-57ff-8ca7-e015251737cb}")
@Guid("cfc0ad5102b757ff8ca7e015251737cb")
@WinRTInterface("cfc0ad5102b757ff8ca7e015251737cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnvironmentManager2.ByReference::class)
public interface IEnvironmentManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreChangesTracked(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnvironmentManager2> {
    public override fun getValue() = ABI.makeIEnvironmentManager2(pointer.getPointer(0))

    public fun setValue(value: IEnvironmentManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnvironmentManager2 {
    public val __345024169_Ptr: Pointer?

    public val _345024169_VtblPtr: Pointer?
      get() = __345024169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreChangesTracked(): Boolean {
      val fnPtr = _345024169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__345024169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEnvironmentManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __345024169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnvironmentManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfc0ad5102b757ff8ca7e015251737cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnvironmentManager2(ptr: Pointer?): WithDefault = IEnvironmentManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnvironmentManager2 {
      val address = segment.toRawLongValue()
      return makeIEnvironmentManager2(Pointer(address))
    }

    public override fun toNative(obj: IEnvironmentManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__345024169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnvironmentManager2): Array<IEnvironmentManager2?> =
        (elements as
        Array<IEnvironmentManager2?>).castToImpl<IEnvironmentManager2,IEnvironmentManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnvironmentManager2?> =
        arrayOfNulls<IEnvironmentManager2_Impl>(size) as Array<IEnvironmentManager2?>
  }
}
