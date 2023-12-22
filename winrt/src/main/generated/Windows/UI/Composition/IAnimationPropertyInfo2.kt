package Windows.UI.Composition

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

@ABIMarker(IAnimationPropertyInfo2.ABI::class)
@Signature("{591720b4-7472-5218-8b39-dffe615ae6da}")
@Guid("591720b4747252188b39dffe615ae6da")
@WinRTInterface("591720b4747252188b39dffe615ae6da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationPropertyInfo2.ByReference::class)
public interface IAnimationPropertyInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetResolvedCompositionObject(): CompositionObject?

  @InterfaceMethod(1)
  public fun GetResolvedCompositionObjectProperty(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationPropertyInfo2> {
    public override fun getValue() = ABI.makeIAnimationPropertyInfo2(pointer.getPointer(0))

    public fun setValue(value: IAnimationPropertyInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationPropertyInfo2 {
    public val __1028359047_Ptr: Pointer?

    public val _1028359047_VtblPtr: Pointer?
      get() = __1028359047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetResolvedCompositionObject(): CompositionObject? {
      val fnPtr = _1028359047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionObject>()
      val hr = fn.invokeHR(arrayOf(__1028359047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetResolvedCompositionObjectProperty(): String? {
      val fnPtr = _1028359047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1028359047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAnimationPropertyInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1028359047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationPropertyInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("591720b4747252188b39dffe615ae6da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationPropertyInfo2(ptr: Pointer?): WithDefault =
        IAnimationPropertyInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationPropertyInfo2 {
      val address = segment.toRawLongValue()
      return makeIAnimationPropertyInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAnimationPropertyInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1028359047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationPropertyInfo2): Array<IAnimationPropertyInfo2?>
        = (elements as
        Array<IAnimationPropertyInfo2?>).castToImpl<IAnimationPropertyInfo2,IAnimationPropertyInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationPropertyInfo2?> =
        arrayOfNulls<IAnimationPropertyInfo2_Impl>(size) as Array<IAnimationPropertyInfo2?>
  }
}
