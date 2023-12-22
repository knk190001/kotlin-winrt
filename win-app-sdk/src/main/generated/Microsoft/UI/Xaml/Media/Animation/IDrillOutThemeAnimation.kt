package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(IDrillOutThemeAnimation.ABI::class)
@Signature("{9a93b9cc-925f-525a-9eac-55d39db3d314}")
@Guid("9a93b9cc925f525a9eac55d39db3d314")
@WinRTInterface("9a93b9cc925f525a9eac55d39db3d314")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDrillOutThemeAnimation.ByReference::class)
public interface IDrillOutThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EntranceTargetName(): String?

  @InterfaceMethod(1)
  public fun put_EntranceTargetName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_EntranceTarget(): DependencyObject?

  @InterfaceMethod(3)
  public fun put_EntranceTarget(value: DependencyObject?): Unit

  @InterfaceMethod(4)
  public fun get_ExitTargetName(): String?

  @InterfaceMethod(5)
  public fun put_ExitTargetName(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_ExitTarget(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_ExitTarget(value: DependencyObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDrillOutThemeAnimation> {
    public override fun getValue() = ABI.makeIDrillOutThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IDrillOutThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDrillOutThemeAnimation {
    public val __1359317833_Ptr: Pointer?

    public val _1359317833_VtblPtr: Pointer?
      get() = __1359317833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EntranceTargetName(): String? {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EntranceTargetName(value: String?): Unit {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EntranceTarget(): DependencyObject? {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EntranceTarget(value: DependencyObject?): Unit {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ExitTargetName(): String? {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ExitTargetName(value: String?): Unit {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ExitTarget(): DependencyObject? {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ExitTarget(value: DependencyObject?): Unit {
      val fnPtr = _1359317833_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1359317833_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDrillOutThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359317833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDrillOutThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a93b9cc925f525a9eac55d39db3d314")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDrillOutThemeAnimation(ptr: Pointer?): WithDefault =
        IDrillOutThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDrillOutThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIDrillOutThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IDrillOutThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359317833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDrillOutThemeAnimation): Array<IDrillOutThemeAnimation?>
        = (elements as
        Array<IDrillOutThemeAnimation?>).castToImpl<IDrillOutThemeAnimation,IDrillOutThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDrillOutThemeAnimation?> =
        arrayOfNulls<IDrillOutThemeAnimation_Impl>(size) as Array<IDrillOutThemeAnimation?>
  }
}
