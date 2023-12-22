package Windows.System

import Windows.Foundation.IReference
import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.UI.Popups.Placement
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

@ABIMarker(ILauncherUIOptions.ABI::class)
@Signature("{1b25da6e-8aa6-41e9-8251-4165f5985f49}")
@Guid("1b25da6e8aa641e982514165f5985f49")
@WinRTInterface("1b25da6e8aa641e982514165f5985f49")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherUIOptions.ByReference::class)
public interface ILauncherUIOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InvocationPoint(): IReference<Point?>?

  @InterfaceMethod(1)
  public fun put_InvocationPoint(value: IReference<Point?>?): Unit

  @InterfaceMethod(2)
  public fun get_SelectionRect(): IReference<Rect?>?

  @InterfaceMethod(3)
  public fun put_SelectionRect(value: IReference<Rect?>?): Unit

  @InterfaceMethod(4)
  public fun get_PreferredPlacement(): Placement?

  @InterfaceMethod(5)
  public fun put_PreferredPlacement(value: Placement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherUIOptions> {
    public override fun getValue() = ABI.makeILauncherUIOptions(pointer.getPointer(0))

    public fun setValue(value: ILauncherUIOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherUIOptions {
    public val __955518523_Ptr: Pointer?

    public val _955518523_VtblPtr: Pointer?
      get() = __955518523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InvocationPoint(): IReference<Point?>? {
      val fnPtr = _955518523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Point?>>()
      val hr = fn.invokeHR(arrayOf(__955518523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Point?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InvocationPoint(value: IReference<Point?>?): Unit {
      val fnPtr = _955518523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955518523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SelectionRect(): IReference<Rect?>? {
      val fnPtr = _955518523_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__955518523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectionRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _955518523_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955518523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PreferredPlacement(): Placement? {
      val fnPtr = _955518523_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Placement>()
      val hr = fn.invokeHR(arrayOf(__955518523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Placement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PreferredPlacement(value: Placement?): Unit {
      val fnPtr = _955518523_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955518523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILauncherUIOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __955518523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherUIOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b25da6e8aa641e982514165f5985f49")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherUIOptions(ptr: Pointer?): WithDefault = ILauncherUIOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherUIOptions {
      val address = segment.toRawLongValue()
      return makeILauncherUIOptions(Pointer(address))
    }

    public override fun toNative(obj: ILauncherUIOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__955518523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherUIOptions): Array<ILauncherUIOptions?> =
        (elements as
        Array<ILauncherUIOptions?>).castToImpl<ILauncherUIOptions,ILauncherUIOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherUIOptions?> =
        arrayOfNulls<ILauncherUIOptions_Impl>(size) as Array<ILauncherUIOptions?>
  }
}
