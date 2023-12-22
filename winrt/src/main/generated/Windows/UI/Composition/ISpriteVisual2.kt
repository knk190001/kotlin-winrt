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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpriteVisual2.ABI::class)
@Signature("{588c9664-997a-4850-91fe-53cb58f81ce9}")
@Guid("588c9664997a485091fe53cb58f81ce9")
@WinRTInterface("588c9664997a485091fe53cb58f81ce9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpriteVisual2.ByReference::class)
public interface ISpriteVisual2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Shadow(): CompositionShadow?

  @InterfaceMethod(1)
  public fun put_Shadow(value: CompositionShadow?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpriteVisual2>
      {
    public override fun getValue() = ABI.makeISpriteVisual2(pointer.getPointer(0))

    public fun setValue(value: ISpriteVisual2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpriteVisual2 {
    public val __1113964927_Ptr: Pointer?

    public val _1113964927_VtblPtr: Pointer?
      get() = __1113964927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Shadow(): CompositionShadow? {
      val fnPtr = _1113964927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionShadow>()
      val hr = fn.invokeHR(arrayOf(__1113964927_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionShadow>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Shadow(value: CompositionShadow?): Unit {
      val fnPtr = _1113964927_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1113964927_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpriteVisual2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1113964927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpriteVisual2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("588c9664997a485091fe53cb58f81ce9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpriteVisual2(ptr: Pointer?): WithDefault = ISpriteVisual2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpriteVisual2 {
      val address = segment.toRawLongValue()
      return makeISpriteVisual2(Pointer(address))
    }

    public override fun toNative(obj: ISpriteVisual2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1113964927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpriteVisual2): Array<ISpriteVisual2?> = (elements as
        Array<ISpriteVisual2?>).castToImpl<ISpriteVisual2,ISpriteVisual2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpriteVisual2?> =
        arrayOfNulls<ISpriteVisual2_Impl>(size) as Array<ISpriteVisual2?>
  }
}
