package Windows.Services.TargetedContent

import Windows.Foundation.Deferral
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

@ABIMarker(ITargetedContentChangedEventArgs.ABI::class)
@Signature("{99d488c9-587e-4586-8ef7-b54ca9453a16}")
@Guid("99d488c9587e45868ef7b54ca9453a16")
@WinRTInterface("99d488c9587e45868ef7b54ca9453a16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentChangedEventArgs.ByReference::class)
public interface ITargetedContentChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  @InterfaceMethod(1)
  public fun get_HasPreviousContentExpired(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentChangedEventArgs> {
    public override fun getValue() = ABI.makeITargetedContentChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentChangedEventArgs {
    public val __908663993_Ptr: Pointer?

    public val _908663993_VtblPtr: Pointer?
      get() = __908663993_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _908663993_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__908663993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasPreviousContentExpired(): Boolean {
      val fnPtr = _908663993_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__908663993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ITargetedContentChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __908663993_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99d488c9587e45868ef7b54ca9453a16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentChangedEventArgs(ptr: Pointer?): WithDefault =
        ITargetedContentChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITargetedContentChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__908663993_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentChangedEventArgs):
        Array<ITargetedContentChangedEventArgs?> = (elements as
        Array<ITargetedContentChangedEventArgs?>).castToImpl<ITargetedContentChangedEventArgs,ITargetedContentChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentChangedEventArgs?> =
        arrayOfNulls<ITargetedContentChangedEventArgs_Impl>(size) as
        Array<ITargetedContentChangedEventArgs?>
  }
}
