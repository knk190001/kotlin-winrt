package Windows.ApplicationModel

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IAppInstanceStatics.ABI::class)
@Signature("{9d11e77f-9ea6-47af-a6ec-46784c5ba254}")
@Guid("9d11e77f9ea647afa6ec46784c5ba254")
@WinRTInterface("9d11e77f9ea647afa6ec46784c5ba254")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstanceStatics.ByReference::class)
public interface IAppInstanceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RecommendedInstance(): AppInstance?

  @InterfaceMethod(1)
  public fun GetActivatedEventArgs(): IActivatedEventArgs?

  @InterfaceMethod(2)
  public fun FindOrRegisterInstanceForKey(key: String?): AppInstance?

  @InterfaceMethod(3)
  public fun Unregister(): Unit

  @InterfaceMethod(4)
  public fun GetInstances(): IVector<AppInstance?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstanceStatics> {
    public override fun getValue() = ABI.makeIAppInstanceStatics(pointer.getPointer(0))

    public fun setValue(value: IAppInstanceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstanceStatics {
    public val __1265940148_Ptr: Pointer?

    public val _1265940148_VtblPtr: Pointer?
      get() = __1265940148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RecommendedInstance(): AppInstance? {
      val fnPtr = _1265940148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstance>()
      val hr = fn.invokeHR(arrayOf(__1265940148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetActivatedEventArgs(): IActivatedEventArgs? {
      val fnPtr = _1265940148_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IActivatedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1265940148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IActivatedEventArgs>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindOrRegisterInstanceForKey(key: String?): AppInstance? {
      val fnPtr = _1265940148_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstance>()
      val hr = fn.invokeHR(arrayOf(__1265940148_Ptr, marshalToNative(key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstance>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Unregister(): Unit {
      val fnPtr = _1265940148_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1265940148_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetInstances(): IVector<AppInstance?>? {
      val fnPtr = _1265940148_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AppInstance?>>()
      val hr = fn.invokeHR(arrayOf(__1265940148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AppInstance?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppInstanceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1265940148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstanceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d11e77f9ea647afa6ec46784c5ba254")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstanceStatics(ptr: Pointer?): WithDefault = IAppInstanceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstanceStatics {
      val address = segment.toRawLongValue()
      return makeIAppInstanceStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppInstanceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1265940148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstanceStatics): Array<IAppInstanceStatics?> =
        (elements as
        Array<IAppInstanceStatics?>).castToImpl<IAppInstanceStatics,IAppInstanceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstanceStatics?> =
        arrayOfNulls<IAppInstanceStatics_Impl>(size) as Array<IAppInstanceStatics?>
  }
}
