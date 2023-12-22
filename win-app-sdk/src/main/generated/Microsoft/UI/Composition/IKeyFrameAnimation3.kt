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

@ABIMarker(IKeyFrameAnimation3.ABI::class)
@Signature("{4f97e180-9bcb-5fc4-abbe-43aa3be327e7}")
@Guid("4f97e1809bcb5fc4abbe43aa3be327e7")
@WinRTInterface("4f97e1809bcb5fc4abbe43aa3be327e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyFrameAnimation3.ByReference::class)
public interface IKeyFrameAnimation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DelayBehavior(): AnimationDelayBehavior?

  @InterfaceMethod(1)
  public fun put_DelayBehavior(value: AnimationDelayBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyFrameAnimation3> {
    public override fun getValue() = ABI.makeIKeyFrameAnimation3(pointer.getPointer(0))

    public fun setValue(value: IKeyFrameAnimation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyFrameAnimation3 {
    public val __1589724682_Ptr: Pointer?

    public val _1589724682_VtblPtr: Pointer?
      get() = __1589724682_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DelayBehavior(): AnimationDelayBehavior? {
      val fnPtr = _1589724682_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDelayBehavior>()
      val hr = fn.invokeHR(arrayOf(__1589724682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDelayBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DelayBehavior(value: AnimationDelayBehavior?): Unit {
      val fnPtr = _1589724682_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1589724682_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeyFrameAnimation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1589724682_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyFrameAnimation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f97e1809bcb5fc4abbe43aa3be327e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyFrameAnimation3(ptr: Pointer?): WithDefault = IKeyFrameAnimation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyFrameAnimation3 {
      val address = segment.toRawLongValue()
      return makeIKeyFrameAnimation3(Pointer(address))
    }

    public override fun toNative(obj: IKeyFrameAnimation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1589724682_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyFrameAnimation3): Array<IKeyFrameAnimation3?> =
        (elements as
        Array<IKeyFrameAnimation3?>).castToImpl<IKeyFrameAnimation3,IKeyFrameAnimation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyFrameAnimation3?> =
        arrayOfNulls<IKeyFrameAnimation3_Impl>(size) as Array<IKeyFrameAnimation3?>
  }
}
