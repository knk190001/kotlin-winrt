package Microsoft.UI.Content

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

@ABIMarker(IContentIslandStateChangedEventArgs.ABI::class)
@Signature("{c828eeb2-0c62-5b40-9d48-77c06083c278}")
@Guid("c828eeb20c625b409d4877c06083c278")
@WinRTInterface("c828eeb20c625b409d4877c06083c278")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIslandStateChangedEventArgs.ByReference::class)
public interface IContentIslandStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DidActualSizeChange(): Boolean

  @InterfaceMethod(1)
  public fun get_DidSiteEnabledChange(): Boolean

  @InterfaceMethod(2)
  public fun get_DidSiteVisibleChange(): Boolean

  @InterfaceMethod(3)
  public fun get_DidLayoutDirectionChange(): Boolean

  @InterfaceMethod(4)
  public fun get_DidRasterizationScaleChange(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIslandStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIContentIslandStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentIslandStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIslandStateChangedEventArgs {
    public val __1947318448_Ptr: Pointer?

    public val _1947318448_VtblPtr: Pointer?
      get() = __1947318448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DidActualSizeChange(): Boolean {
      val fnPtr = _1947318448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1947318448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DidSiteEnabledChange(): Boolean {
      val fnPtr = _1947318448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1947318448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DidSiteVisibleChange(): Boolean {
      val fnPtr = _1947318448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1947318448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DidLayoutDirectionChange(): Boolean {
      val fnPtr = _1947318448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1947318448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DidRasterizationScaleChange(): Boolean {
      val fnPtr = _1947318448_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1947318448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContentIslandStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1947318448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIslandStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c828eeb20c625b409d4877c06083c278")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIslandStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IContentIslandStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIslandStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentIslandStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentIslandStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1947318448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIslandStateChangedEventArgs):
        Array<IContentIslandStateChangedEventArgs?> = (elements as
        Array<IContentIslandStateChangedEventArgs?>).castToImpl<IContentIslandStateChangedEventArgs,IContentIslandStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIslandStateChangedEventArgs?> =
        arrayOfNulls<IContentIslandStateChangedEventArgs_Impl>(size) as
        Array<IContentIslandStateChangedEventArgs?>
  }
}
