package Microsoft.UI.Content

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentIslandEnvironment2.ABI::class)
@Signature("{0de23993-cffb-5677-9442-31adb1f555bf}")
@Guid("0de23993cffb5677944231adb1f555bf")
@WinRTInterface("0de23993cffb5677944231adb1f555bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIslandEnvironment2.ByReference::class)
public interface IContentIslandEnvironment2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentOrientation(): ContentDisplayOrientations?

  @InterfaceMethod(1)
  public fun get_DisplayScale(): Float

  @InterfaceMethod(2)
  public fun get_NativeOrientation(): ContentDisplayOrientations?

  @InterfaceMethod(3)
  public fun add_ThemeChanged(handler: TypedEventHandler<ContentIslandEnvironment?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_ThemeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIslandEnvironment2> {
    public override fun getValue() = ABI.makeIContentIslandEnvironment2(pointer.getPointer(0))

    public fun setValue(value: IContentIslandEnvironment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIslandEnvironment2 {
    public val __1998382429_Ptr: Pointer?

    public val _1998382429_VtblPtr: Pointer?
      get() = __1998382429_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentOrientation(): ContentDisplayOrientations? {
      val fnPtr = _1998382429_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__1998382429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayScale(): Float {
      val fnPtr = _1998382429_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1998382429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_NativeOrientation(): ContentDisplayOrientations? {
      val fnPtr = _1998382429_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__1998382429_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_ThemeChanged(handler: TypedEventHandler<ContentIslandEnvironment?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1998382429_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1998382429_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_ThemeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1998382429_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1998382429_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentIslandEnvironment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1998382429_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIslandEnvironment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0de23993cffb5677944231adb1f555bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIslandEnvironment2(ptr: Pointer?): WithDefault =
        IContentIslandEnvironment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIslandEnvironment2 {
      val address = segment.toRawLongValue()
      return makeIContentIslandEnvironment2(Pointer(address))
    }

    public override fun toNative(obj: IContentIslandEnvironment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1998382429_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIslandEnvironment2):
        Array<IContentIslandEnvironment2?> = (elements as
        Array<IContentIslandEnvironment2?>).castToImpl<IContentIslandEnvironment2,IContentIslandEnvironment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIslandEnvironment2?> =
        arrayOfNulls<IContentIslandEnvironment2_Impl>(size) as Array<IContentIslandEnvironment2?>
  }
}
