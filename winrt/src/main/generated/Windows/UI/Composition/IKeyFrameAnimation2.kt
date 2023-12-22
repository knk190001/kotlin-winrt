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

@ABIMarker(IKeyFrameAnimation2.ABI::class)
@Signature("{f4b488bb-2940-4ec0-a41a-eb6d801a2f18}")
@Guid("f4b488bb29404ec0a41aeb6d801a2f18")
@WinRTInterface("f4b488bb29404ec0a41aeb6d801a2f18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyFrameAnimation2.ByReference::class)
public interface IKeyFrameAnimation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Direction(): AnimationDirection?

  @InterfaceMethod(1)
  public fun put_Direction(value: AnimationDirection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyFrameAnimation2> {
    public override fun getValue() = ABI.makeIKeyFrameAnimation2(pointer.getPointer(0))

    public fun setValue(value: IKeyFrameAnimation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyFrameAnimation2 {
    public val __788529590_Ptr: Pointer?

    public val _788529590_VtblPtr: Pointer?
      get() = __788529590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Direction(): AnimationDirection? {
      val fnPtr = _788529590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDirection>()
      val hr = fn.invokeHR(arrayOf(__788529590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Direction(value: AnimationDirection?): Unit {
      val fnPtr = _788529590_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__788529590_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeyFrameAnimation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __788529590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyFrameAnimation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4b488bb29404ec0a41aeb6d801a2f18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyFrameAnimation2(ptr: Pointer?): WithDefault = IKeyFrameAnimation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyFrameAnimation2 {
      val address = segment.toRawLongValue()
      return makeIKeyFrameAnimation2(Pointer(address))
    }

    public override fun toNative(obj: IKeyFrameAnimation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__788529590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyFrameAnimation2): Array<IKeyFrameAnimation2?> =
        (elements as
        Array<IKeyFrameAnimation2?>).castToImpl<IKeyFrameAnimation2,IKeyFrameAnimation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyFrameAnimation2?> =
        arrayOfNulls<IKeyFrameAnimation2_Impl>(size) as Array<IKeyFrameAnimation2?>
  }
}
