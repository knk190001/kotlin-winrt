package Windows.UI.ViewManagement.Core

import Windows.Foundation.Rect
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

@ABIMarker(ICoreInputViewOcclusion.ABI::class)
@Signature("{cc36ce06-3865-4177-b5f5-8b65e0b9ce84}")
@Guid("cc36ce0638654177b5f58b65e0b9ce84")
@WinRTInterface("cc36ce0638654177b5f58b65e0b9ce84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewOcclusion.ByReference::class)
public interface ICoreInputViewOcclusion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OccludingRect(): Rect?

  @InterfaceMethod(1)
  public fun get_OcclusionKind(): CoreInputViewOcclusionKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewOcclusion> {
    public override fun getValue() = ABI.makeICoreInputViewOcclusion(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewOcclusion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewOcclusion {
    public val __863081232_Ptr: Pointer?

    public val _863081232_VtblPtr: Pointer?
      get() = __863081232_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OccludingRect(): Rect? {
      val fnPtr = _863081232_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__863081232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OcclusionKind(): CoreInputViewOcclusionKind? {
      val fnPtr = _863081232_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInputViewOcclusionKind>()
      val hr = fn.invokeHR(arrayOf(__863081232_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInputViewOcclusionKind>(result.getValue())
      return resultValue
    }
  }

  public class ICoreInputViewOcclusion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __863081232_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewOcclusion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc36ce0638654177b5f58b65e0b9ce84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewOcclusion(ptr: Pointer?): WithDefault =
        ICoreInputViewOcclusion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputViewOcclusion {
      val address = segment.toRawLongValue()
      return makeICoreInputViewOcclusion(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewOcclusion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__863081232_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewOcclusion): Array<ICoreInputViewOcclusion?>
        = (elements as
        Array<ICoreInputViewOcclusion?>).castToImpl<ICoreInputViewOcclusion,ICoreInputViewOcclusion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewOcclusion?> =
        arrayOfNulls<ICoreInputViewOcclusion_Impl>(size) as Array<ICoreInputViewOcclusion?>
  }
}
