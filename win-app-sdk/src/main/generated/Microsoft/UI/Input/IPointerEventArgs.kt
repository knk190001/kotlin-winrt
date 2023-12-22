package Microsoft.UI.Input

import Windows.Foundation.Collections.IVector
import Windows.System.VirtualKeyModifiers
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

@ABIMarker(IPointerEventArgs.ABI::class)
@Signature("{865b188c-2ed5-5df8-829f-ac0701d5c51a}")
@Guid("865b188c2ed55df8829fac0701d5c51a")
@WinRTInterface("865b188c2ed55df8829fac0701d5c51a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerEventArgs.ByReference::class)
public interface IPointerEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentPoint(): PointerPoint?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_KeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(4)
  public fun GetIntermediatePoints(): IVector<PointerPoint?>?

  @InterfaceMethod(5)
  public fun GetIntermediateTransformedPoints(transform: IPointerPointTransform?):
      IVector<PointerPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerEventArgs> {
    public override fun getValue() = ABI.makeIPointerEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPointerEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerEventArgs {
    public val __780417107_Ptr: Pointer?

    public val _780417107_VtblPtr: Pointer?
      get() = __780417107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentPoint(): PointerPoint? {
      val fnPtr = _780417107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__780417107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _780417107_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__780417107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _780417107_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__780417107_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_KeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _780417107_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__780417107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetIntermediatePoints(): IVector<PointerPoint?>? {
      val fnPtr = _780417107_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__780417107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetIntermediateTransformedPoints(transform: IPointerPointTransform?):
        IVector<PointerPoint?>? {
      val fnPtr = _780417107_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__780417107_Ptr, marshalToNative(transform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __780417107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("865b188c2ed55df8829fac0701d5c51a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerEventArgs(ptr: Pointer?): WithDefault = IPointerEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerEventArgs {
      val address = segment.toRawLongValue()
      return makeIPointerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPointerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__780417107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerEventArgs): Array<IPointerEventArgs?> = (elements
        as Array<IPointerEventArgs?>).castToImpl<IPointerEventArgs,IPointerEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerEventArgs?> =
        arrayOfNulls<IPointerEventArgs_Impl>(size) as Array<IPointerEventArgs?>
  }
}
