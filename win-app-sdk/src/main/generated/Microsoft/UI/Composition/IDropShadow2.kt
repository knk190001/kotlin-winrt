package Microsoft.UI.Composition

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

@ABIMarker(IDropShadow2.ABI::class)
@Signature("{cbc7c266-2d33-5711-b3b4-5699410bef56}")
@Guid("cbc7c2662d335711b3b45699410bef56")
@WinRTInterface("cbc7c2662d335711b3b45699410bef56")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropShadow2.ByReference::class)
public interface IDropShadow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourcePolicy(): CompositionDropShadowSourcePolicy?

  @InterfaceMethod(1)
  public fun put_SourcePolicy(value: CompositionDropShadowSourcePolicy?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDropShadow2> {
    public override fun getValue() = ABI.makeIDropShadow2(pointer.getPointer(0))

    public fun setValue(value: IDropShadow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropShadow2 {
    public val __1469278358_Ptr: Pointer?

    public val _1469278358_VtblPtr: Pointer?
      get() = __1469278358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourcePolicy(): CompositionDropShadowSourcePolicy? {
      val fnPtr = _1469278358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionDropShadowSourcePolicy>()
      val hr = fn.invokeHR(arrayOf(__1469278358_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionDropShadowSourcePolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourcePolicy(value: CompositionDropShadowSourcePolicy?): Unit {
      val fnPtr = _1469278358_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1469278358_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDropShadow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1469278358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropShadow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cbc7c2662d335711b3b45699410bef56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropShadow2(ptr: Pointer?): WithDefault = IDropShadow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropShadow2 {
      val address = segment.toRawLongValue()
      return makeIDropShadow2(Pointer(address))
    }

    public override fun toNative(obj: IDropShadow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1469278358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropShadow2): Array<IDropShadow2?> = (elements as
        Array<IDropShadow2?>).castToImpl<IDropShadow2,IDropShadow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropShadow2?> =
        arrayOfNulls<IDropShadow2_Impl>(size) as Array<IDropShadow2?>
  }
}
