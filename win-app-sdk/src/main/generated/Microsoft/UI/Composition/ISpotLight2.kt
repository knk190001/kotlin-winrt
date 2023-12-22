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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpotLight2.ABI::class)
@Signature("{49dd3b50-ec5c-5b6c-baa1-8504b13e3a67}")
@Guid("49dd3b50ec5c5b6cbaa18504b13e3a67")
@WinRTInterface("49dd3b50ec5c5b6cbaa18504b13e3a67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpotLight2.ByReference::class)
public interface ISpotLight2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InnerConeIntensity(): Float

  @InterfaceMethod(1)
  public fun put_InnerConeIntensity(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_OuterConeIntensity(): Float

  @InterfaceMethod(3)
  public fun put_OuterConeIntensity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpotLight2> {
    public override fun getValue() = ABI.makeISpotLight2(pointer.getPointer(0))

    public fun setValue(value: ISpotLight2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpotLight2 {
    public val __1476675159_Ptr: Pointer?

    public val _1476675159_VtblPtr: Pointer?
      get() = __1476675159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InnerConeIntensity(): Float {
      val fnPtr = _1476675159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1476675159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_InnerConeIntensity(value: Float): Unit {
      val fnPtr = _1476675159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1476675159_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OuterConeIntensity(): Float {
      val fnPtr = _1476675159_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1476675159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_OuterConeIntensity(value: Float): Unit {
      val fnPtr = _1476675159_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1476675159_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpotLight2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1476675159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpotLight2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49dd3b50ec5c5b6cbaa18504b13e3a67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpotLight2(ptr: Pointer?): WithDefault = ISpotLight2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpotLight2 {
      val address = segment.toRawLongValue()
      return makeISpotLight2(Pointer(address))
    }

    public override fun toNative(obj: ISpotLight2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1476675159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpotLight2): Array<ISpotLight2?> = (elements as
        Array<ISpotLight2?>).castToImpl<ISpotLight2,ISpotLight2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpotLight2?> =
        arrayOfNulls<ISpotLight2_Impl>(size) as Array<ISpotLight2?>
  }
}
