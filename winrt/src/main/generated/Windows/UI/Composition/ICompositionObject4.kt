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

@ABIMarker(ICompositionObject4.ABI::class)
@Signature("{0bb3784c-346b-4a7c-966b-7310966553d5}")
@Guid("0bb3784c346b4a7c966b7310966553d5")
@WinRTInterface("0bb3784c346b4a7c966b7310966553d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionObject4.ByReference::class)
public interface ICompositionObject4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetAnimationController(propertyName: String?): AnimationController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionObject4> {
    public override fun getValue() = ABI.makeICompositionObject4(pointer.getPointer(0))

    public fun setValue(value: ICompositionObject4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionObject4 {
    public val __1304991737_Ptr: Pointer?

    public val _1304991737_VtblPtr: Pointer?
      get() = __1304991737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetAnimationController(propertyName: String?): AnimationController? {
      val fnPtr = _1304991737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationController>()
      val hr = fn.invokeHR(arrayOf(__1304991737_Ptr, marshalToNative(propertyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationController>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionObject4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1304991737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionObject4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bb3784c346b4a7c966b7310966553d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionObject4(ptr: Pointer?): WithDefault = ICompositionObject4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionObject4 {
      val address = segment.toRawLongValue()
      return makeICompositionObject4(Pointer(address))
    }

    public override fun toNative(obj: ICompositionObject4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1304991737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionObject4): Array<ICompositionObject4?> =
        (elements as
        Array<ICompositionObject4?>).castToImpl<ICompositionObject4,ICompositionObject4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionObject4?> =
        arrayOfNulls<ICompositionObject4_Impl>(size) as Array<ICompositionObject4?>
  }
}
