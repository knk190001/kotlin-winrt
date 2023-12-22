package Microsoft.Windows.ApplicationModel.Resources

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IResourceContext.ABI::class)
@Signature("{96fb48dc-f77d-55ff-af12-34861e3d4939}")
@Guid("96fb48dcf77d55ffaf1234861e3d4939")
@WinRTInterface("96fb48dcf77d55ffaf1234861e3d4939")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceContext.ByReference::class)
public interface IResourceContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QualifierValues(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceContext> {
    public override fun getValue() = ABI.makeIResourceContext(pointer.getPointer(0))

    public fun setValue(value: IResourceContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceContext {
    public val __818092531_Ptr: Pointer?

    public val _818092531_VtblPtr: Pointer?
      get() = __818092531_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QualifierValues(): IMap<String?, String?>? {
      val fnPtr = _818092531_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__818092531_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818092531_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96fb48dcf77d55ffaf1234861e3d4939")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceContext(ptr: Pointer?): WithDefault = IResourceContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceContext {
      val address = segment.toRawLongValue()
      return makeIResourceContext(Pointer(address))
    }

    public override fun toNative(obj: IResourceContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818092531_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceContext): Array<IResourceContext?> = (elements as
        Array<IResourceContext?>).castToImpl<IResourceContext,IResourceContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceContext?> =
        arrayOfNulls<IResourceContext_Impl>(size) as Array<IResourceContext?>
  }
}
