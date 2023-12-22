package Windows.UI.ViewManagement

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IApplicationViewSwitcherStatics.ABI::class)
@Signature("{975f2f1e-e656-4c5e-a0a1-717c6ffa7d64}")
@Guid("975f2f1ee6564c5ea0a1717c6ffa7d64")
@WinRTInterface("975f2f1ee6564c5ea0a1717c6ffa7d64")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewSwitcherStatics.ByReference::class)
public interface IApplicationViewSwitcherStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DisableShowingMainViewOnActivation(): Unit

  @InterfaceMethod(1)
  public fun TryShowAsStandaloneAsync(viewId: Int): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun TryShowAsStandaloneAsync(viewId: Int, sizePreference: ViewSizePreference?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun TryShowAsStandaloneAsync(
    viewId: Int,
    sizePreference: ViewSizePreference?,
    anchorViewId: Int,
    anchorSizePreference: ViewSizePreference?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun SwitchAsync(viewId: Int): IAsyncAction?

  @InterfaceMethod(5)
  public fun SwitchAsync(toViewId: Int, fromViewId: Int): IAsyncAction?

  @InterfaceMethod(6)
  public fun SwitchAsync(
    toViewId: Int,
    fromViewId: Int,
    options: ApplicationViewSwitchingOptions?
  ): IAsyncAction?

  @InterfaceMethod(7)
  public fun PrepareForCustomAnimatedSwitchAsync(
    toViewId: Int,
    fromViewId: Int,
    options: ApplicationViewSwitchingOptions?
  ): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewSwitcherStatics> {
    public override fun getValue() = ABI.makeIApplicationViewSwitcherStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewSwitcherStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewSwitcherStatics {
    public val __1890786335_Ptr: Pointer?

    public val _1890786335_VtblPtr: Pointer?
      get() = __1890786335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DisableShowingMainViewOnActivation(): Unit {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryShowAsStandaloneAsync(viewId: Int): IAsyncOperation<Boolean>? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, viewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryShowAsStandaloneAsync(viewId: Int, sizePreference: ViewSizePreference?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, viewId, marshalToNative(sizePreference),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryShowAsStandaloneAsync(
      viewId: Int,
      sizePreference: ViewSizePreference?,
      anchorViewId: Int,
      anchorSizePreference: ViewSizePreference?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, viewId, marshalToNative(sizePreference),
          anchorViewId, marshalToNative(anchorSizePreference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SwitchAsync(viewId: Int): IAsyncAction? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, viewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SwitchAsync(toViewId: Int, fromViewId: Int): IAsyncAction? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, toViewId, fromViewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SwitchAsync(
      toViewId: Int,
      fromViewId: Int,
      options: ApplicationViewSwitchingOptions?
    ): IAsyncAction? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, toViewId, fromViewId, marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun PrepareForCustomAnimatedSwitchAsync(
      toViewId: Int,
      fromViewId: Int,
      options: ApplicationViewSwitchingOptions?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1890786335_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1890786335_Ptr, toViewId, fromViewId, marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationViewSwitcherStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1890786335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewSwitcherStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("975f2f1ee6564c5ea0a1717c6ffa7d64")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewSwitcherStatics(ptr: Pointer?): WithDefault =
        IApplicationViewSwitcherStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewSwitcherStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationViewSwitcherStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewSwitcherStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1890786335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewSwitcherStatics):
        Array<IApplicationViewSwitcherStatics?> = (elements as
        Array<IApplicationViewSwitcherStatics?>).castToImpl<IApplicationViewSwitcherStatics,IApplicationViewSwitcherStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewSwitcherStatics?> =
        arrayOfNulls<IApplicationViewSwitcherStatics_Impl>(size) as
        Array<IApplicationViewSwitcherStatics?>
  }
}
