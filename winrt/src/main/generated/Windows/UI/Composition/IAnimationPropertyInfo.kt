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

@ABIMarker(IAnimationPropertyInfo.ABI::class)
@Signature("{f4716f05-ed77-4e3c-b328-5c3985b3738f}")
@Guid("f4716f05ed774e3cb3285c3985b3738f")
@WinRTInterface("f4716f05ed774e3cb3285c3985b3738f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationPropertyInfo.ByReference::class)
public interface IAnimationPropertyInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccessMode(): AnimationPropertyAccessMode?

  @InterfaceMethod(1)
  public fun put_AccessMode(value: AnimationPropertyAccessMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationPropertyInfo> {
    public override fun getValue() = ABI.makeIAnimationPropertyInfo(pointer.getPointer(0))

    public fun setValue(value: IAnimationPropertyInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationPropertyInfo {
    public val __1003004199_Ptr: Pointer?

    public val _1003004199_VtblPtr: Pointer?
      get() = __1003004199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccessMode(): AnimationPropertyAccessMode? {
      val fnPtr = _1003004199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationPropertyAccessMode>()
      val hr = fn.invokeHR(arrayOf(__1003004199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationPropertyAccessMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AccessMode(value: AnimationPropertyAccessMode?): Unit {
      val fnPtr = _1003004199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1003004199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimationPropertyInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1003004199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationPropertyInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4716f05ed774e3cb3285c3985b3738f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationPropertyInfo(ptr: Pointer?): WithDefault =
        IAnimationPropertyInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationPropertyInfo {
      val address = segment.toRawLongValue()
      return makeIAnimationPropertyInfo(Pointer(address))
    }

    public override fun toNative(obj: IAnimationPropertyInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1003004199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationPropertyInfo): Array<IAnimationPropertyInfo?> =
        (elements as
        Array<IAnimationPropertyInfo?>).castToImpl<IAnimationPropertyInfo,IAnimationPropertyInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationPropertyInfo?> =
        arrayOfNulls<IAnimationPropertyInfo_Impl>(size) as Array<IAnimationPropertyInfo?>
  }
}
