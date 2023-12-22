package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IObjectAnimationUsingKeyFrames.ABI::class)
@Signature("{334a2d92-b74a-4c64-b9a6-58bcfa314f22}")
@Guid("334a2d92b74a4c64b9a658bcfa314f22")
@WinRTInterface("334a2d92b74a4c64b9a658bcfa314f22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IObjectAnimationUsingKeyFrames.ByReference::class)
public interface IObjectAnimationUsingKeyFrames : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyFrames(): ObjectKeyFrameCollection?

  @InterfaceMethod(1)
  public fun get_EnableDependentAnimation(): Boolean

  @InterfaceMethod(2)
  public fun put_EnableDependentAnimation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObjectAnimationUsingKeyFrames> {
    public override fun getValue() = ABI.makeIObjectAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: IObjectAnimationUsingKeyFrames_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IObjectAnimationUsingKeyFrames {
    public val __1531948576_Ptr: Pointer?

    public val _1531948576_VtblPtr: Pointer?
      get() = __1531948576_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyFrames(): ObjectKeyFrameCollection? {
      val fnPtr = _1531948576_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ObjectKeyFrameCollection>()
      val hr = fn.invokeHR(arrayOf(__1531948576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ObjectKeyFrameCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnableDependentAnimation(): Boolean {
      val fnPtr = _1531948576_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1531948576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_EnableDependentAnimation(value: Boolean): Unit {
      val fnPtr = _1531948576_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1531948576_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IObjectAnimationUsingKeyFrames_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1531948576_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IObjectAnimationUsingKeyFrames, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("334a2d92b74a4c64b9a658bcfa314f22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIObjectAnimationUsingKeyFrames(ptr: Pointer?): WithDefault =
        IObjectAnimationUsingKeyFrames_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IObjectAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return makeIObjectAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: IObjectAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1531948576_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IObjectAnimationUsingKeyFrames):
        Array<IObjectAnimationUsingKeyFrames?> = (elements as
        Array<IObjectAnimationUsingKeyFrames?>).castToImpl<IObjectAnimationUsingKeyFrames,IObjectAnimationUsingKeyFrames_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObjectAnimationUsingKeyFrames?> =
        arrayOfNulls<IObjectAnimationUsingKeyFrames_Impl>(size) as
        Array<IObjectAnimationUsingKeyFrames?>
  }
}
