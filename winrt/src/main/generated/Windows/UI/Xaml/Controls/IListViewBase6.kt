package Windows.UI.Xaml.Controls

import Windows.Foundation.IAsyncOperation
import Windows.UI.Xaml.Media.Animation.ConnectedAnimation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IListViewBase6.ABI::class)
@Signature("{f8a42637-965b-483b-94e5-e5c9fef0e352}")
@Guid("f8a42637965b483b94e5e5c9fef0e352")
@WinRTInterface("f8a42637965b483b94e5e5c9fef0e352")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBase6.ByReference::class)
public interface IListViewBase6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryStartConnectedAnimationAsync(
    animation: ConnectedAnimation?,
    item: IUnknown?,
    elementName: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun PrepareConnectedAnimation(
    key: String?,
    item: IUnknown?,
    elementName: String?
  ): ConnectedAnimation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListViewBase6>
      {
    public override fun getValue() = ABI.makeIListViewBase6(pointer.getPointer(0))

    public fun setValue(value: IListViewBase6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBase6 {
    public val __1194261062_Ptr: Pointer?

    public val _1194261062_VtblPtr: Pointer?
      get() = __1194261062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryStartConnectedAnimationAsync(
      animation: ConnectedAnimation?,
      item: IUnknown?,
      elementName: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1194261062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1194261062_Ptr, marshalToNative(animation),
          marshalToNative(item), marshalToNative(elementName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PrepareConnectedAnimation(
      key: String?,
      item: IUnknown?,
      elementName: String?
    ): ConnectedAnimation? {
      val fnPtr = _1194261062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimation>()
      val hr = fn.invokeHR(arrayOf(__1194261062_Ptr, marshalToNative(key), marshalToNative(item),
          marshalToNative(elementName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimation>(result.getValue())
      return resultValue
    }
  }

  public class IListViewBase6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1194261062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBase6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8a42637965b483b94e5e5c9fef0e352")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBase6(ptr: Pointer?): WithDefault = IListViewBase6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBase6 {
      val address = segment.toRawLongValue()
      return makeIListViewBase6(Pointer(address))
    }

    public override fun toNative(obj: IListViewBase6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1194261062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBase6): Array<IListViewBase6?> = (elements as
        Array<IListViewBase6?>).castToImpl<IListViewBase6,IListViewBase6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBase6?> =
        arrayOfNulls<IListViewBase6_Impl>(size) as Array<IListViewBase6?>
  }
}
