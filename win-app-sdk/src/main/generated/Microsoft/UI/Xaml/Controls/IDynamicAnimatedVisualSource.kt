package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnimatedVisualSource.ABI.IID
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IDynamicAnimatedVisualSource.ABI::class)
@Signature("{ab00e5cf-1be6-559c-ad5b-0253bb17c0f7}")
@Guid("ab00e5cf1be6559cad5b0253bb17c0f7")
@WinRTInterface("ab00e5cf1be6559cad5b0253bb17c0f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDynamicAnimatedVisualSource.ByReference::class)
public interface IDynamicAnimatedVisualSource : NativeMapped, IWinRTInterface, IAnimatedVisualSource
    {
  @InterfaceMethod(0)
  public fun add_AnimatedVisualInvalidated(handler: TypedEventHandler<IDynamicAnimatedVisualSource?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AnimatedVisualInvalidated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDynamicAnimatedVisualSource> {
    public override fun getValue() = ABI.makeIDynamicAnimatedVisualSource(pointer.getPointer(0))

    public fun setValue(value: IDynamicAnimatedVisualSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDynamicAnimatedVisualSource, IAnimatedVisualSource.WithDefault {
    public val __1637177718_Ptr: Pointer?

    public val _1637177718_VtblPtr: Pointer?
      get() = __1637177718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_AnimatedVisualInvalidated(handler: TypedEventHandler<IDynamicAnimatedVisualSource?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1637177718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1637177718_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AnimatedVisualInvalidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1637177718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1637177718_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDynamicAnimatedVisualSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAnimatedVisualSource {
    public override val __243289851_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1637177718_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1637177718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDynamicAnimatedVisualSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab00e5cf1be6559cad5b0253bb17c0f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDynamicAnimatedVisualSource(ptr: Pointer?): WithDefault =
        IDynamicAnimatedVisualSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDynamicAnimatedVisualSource {
      val address = segment.toRawLongValue()
      return makeIDynamicAnimatedVisualSource(Pointer(address))
    }

    public override fun toNative(obj: IDynamicAnimatedVisualSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1637177718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDynamicAnimatedVisualSource):
        Array<IDynamicAnimatedVisualSource?> = (elements as
        Array<IDynamicAnimatedVisualSource?>).castToImpl<IDynamicAnimatedVisualSource,IDynamicAnimatedVisualSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDynamicAnimatedVisualSource?> =
        arrayOfNulls<IDynamicAnimatedVisualSource_Impl>(size) as
        Array<IDynamicAnimatedVisualSource?>
  }
}
