package Windows.Security.EnterpriseData

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

@ABIMarker(IFileUnprotectOptions.ABI::class)
@Signature("{7d1312f1-3b0d-4dd8-a1f8-1ec53822e2f3}")
@Guid("7d1312f13b0d4dd8a1f81ec53822e2f3")
@WinRTInterface("7d1312f13b0d4dd8a1f81ec53822e2f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileUnprotectOptions.ByReference::class)
public interface IFileUnprotectOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Audit(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Audit(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileUnprotectOptions> {
    public override fun getValue() = ABI.makeIFileUnprotectOptions(pointer.getPointer(0))

    public fun setValue(value: IFileUnprotectOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileUnprotectOptions {
    public val __1888801631_Ptr: Pointer?

    public val _1888801631_VtblPtr: Pointer?
      get() = __1888801631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Audit(value: Boolean): Unit {
      val fnPtr = _1888801631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1888801631_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Audit(): Boolean {
      val fnPtr = _1888801631_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1888801631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFileUnprotectOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1888801631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileUnprotectOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d1312f13b0d4dd8a1f81ec53822e2f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileUnprotectOptions(ptr: Pointer?): WithDefault =
        IFileUnprotectOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileUnprotectOptions {
      val address = segment.toRawLongValue()
      return makeIFileUnprotectOptions(Pointer(address))
    }

    public override fun toNative(obj: IFileUnprotectOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1888801631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileUnprotectOptions): Array<IFileUnprotectOptions?> =
        (elements as
        Array<IFileUnprotectOptions?>).castToImpl<IFileUnprotectOptions,IFileUnprotectOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileUnprotectOptions?> =
        arrayOfNulls<IFileUnprotectOptions_Impl>(size) as Array<IFileUnprotectOptions?>
  }
}
