package Windows.UI.Xaml

import Windows.Foundation.IReference
import Windows.Foundation.Rect
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

@ABIMarker(IBringIntoViewOptions.ABI::class)
@Signature("{19bdd1b5-c7cb-46d9-a4dd-a1bbe83ef2fb}")
@Guid("19bdd1b5c7cb46d9a4dda1bbe83ef2fb")
@WinRTInterface("19bdd1b5c7cb46d9a4dda1bbe83ef2fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBringIntoViewOptions.ByReference::class)
public interface IBringIntoViewOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationDesired(): Boolean

  @InterfaceMethod(1)
  public fun put_AnimationDesired(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TargetRect(): IReference<Rect?>?

  @InterfaceMethod(3)
  public fun put_TargetRect(value: IReference<Rect?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBringIntoViewOptions> {
    public override fun getValue() = ABI.makeIBringIntoViewOptions(pointer.getPointer(0))

    public fun setValue(value: IBringIntoViewOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBringIntoViewOptions {
    public val __1593559271_Ptr: Pointer?

    public val _1593559271_VtblPtr: Pointer?
      get() = __1593559271_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationDesired(): Boolean {
      val fnPtr = _1593559271_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1593559271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AnimationDesired(value: Boolean): Unit {
      val fnPtr = _1593559271_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1593559271_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TargetRect(): IReference<Rect?>? {
      val fnPtr = _1593559271_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__1593559271_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TargetRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _1593559271_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1593559271_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBringIntoViewOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1593559271_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBringIntoViewOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19bdd1b5c7cb46d9a4dda1bbe83ef2fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBringIntoViewOptions(ptr: Pointer?): WithDefault =
        IBringIntoViewOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBringIntoViewOptions {
      val address = segment.toRawLongValue()
      return makeIBringIntoViewOptions(Pointer(address))
    }

    public override fun toNative(obj: IBringIntoViewOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1593559271_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBringIntoViewOptions): Array<IBringIntoViewOptions?> =
        (elements as
        Array<IBringIntoViewOptions?>).castToImpl<IBringIntoViewOptions,IBringIntoViewOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBringIntoViewOptions?> =
        arrayOfNulls<IBringIntoViewOptions_Impl>(size) as Array<IBringIntoViewOptions?>
  }
}
