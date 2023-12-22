package Windows.ApplicationModel.Background

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

@ABIMarker(IAppBroadcastTriggerFactory.ABI::class)
@Signature("{280b9f44-22f4-4618-a02e-e7e411eb7238}")
@Guid("280b9f4422f44618a02ee7e411eb7238")
@WinRTInterface("280b9f4422f44618a02ee7e411eb7238")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastTriggerFactory.ByReference::class)
public interface IAppBroadcastTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAppBroadcastTrigger(providerKey: String?): AppBroadcastTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastTriggerFactory> {
    public override fun getValue() = ABI.makeIAppBroadcastTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastTriggerFactory {
    public val __979716445_Ptr: Pointer?

    public val _979716445_VtblPtr: Pointer?
      get() = __979716445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAppBroadcastTrigger(providerKey: String?): AppBroadcastTrigger? {
      val fnPtr = _979716445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastTrigger>()
      val hr = fn.invokeHR(arrayOf(__979716445_Ptr, marshalToNative(providerKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __979716445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("280b9f4422f44618a02ee7e411eb7238")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastTriggerFactory(ptr: Pointer?): WithDefault =
        IAppBroadcastTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__979716445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastTriggerFactory):
        Array<IAppBroadcastTriggerFactory?> = (elements as
        Array<IAppBroadcastTriggerFactory?>).castToImpl<IAppBroadcastTriggerFactory,IAppBroadcastTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastTriggerFactory?> =
        arrayOfNulls<IAppBroadcastTriggerFactory_Impl>(size) as Array<IAppBroadcastTriggerFactory?>
  }
}
