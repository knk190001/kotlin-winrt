package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactLaunchActionVerbsStatics.ABI::class)
@Signature("{fb1232d6-ee73-46e7-8761-11cd0157728f}")
@Guid("fb1232d6ee7346e7876111cd0157728f")
@WinRTInterface("fb1232d6ee7346e7876111cd0157728f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactLaunchActionVerbsStatics.ByReference::class)
public interface IContactLaunchActionVerbsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Call(): String?

  @InterfaceMethod(1)
  public fun get_Message(): String?

  @InterfaceMethod(2)
  public fun get_Map(): String?

  @InterfaceMethod(3)
  public fun get_Post(): String?

  @InterfaceMethod(4)
  public fun get_VideoCall(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactLaunchActionVerbsStatics> {
    public override fun getValue() = ABI.makeIContactLaunchActionVerbsStatics(pointer.getPointer(0))

    public fun setValue(value: IContactLaunchActionVerbsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactLaunchActionVerbsStatics {
    public val __356880850_Ptr: Pointer?

    public val _356880850_VtblPtr: Pointer?
      get() = __356880850_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Call(): String? {
      val fnPtr = _356880850_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__356880850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Message(): String? {
      val fnPtr = _356880850_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__356880850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Map(): String? {
      val fnPtr = _356880850_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__356880850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Post(): String? {
      val fnPtr = _356880850_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__356880850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_VideoCall(): String? {
      val fnPtr = _356880850_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__356880850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactLaunchActionVerbsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __356880850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactLaunchActionVerbsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb1232d6ee7346e7876111cd0157728f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactLaunchActionVerbsStatics(ptr: Pointer?): WithDefault =
        IContactLaunchActionVerbsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactLaunchActionVerbsStatics {
      val address = segment.toRawLongValue()
      return makeIContactLaunchActionVerbsStatics(Pointer(address))
    }

    public override fun toNative(obj: IContactLaunchActionVerbsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__356880850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactLaunchActionVerbsStatics):
        Array<IContactLaunchActionVerbsStatics?> = (elements as
        Array<IContactLaunchActionVerbsStatics?>).castToImpl<IContactLaunchActionVerbsStatics,IContactLaunchActionVerbsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactLaunchActionVerbsStatics?> =
        arrayOfNulls<IContactLaunchActionVerbsStatics_Impl>(size) as
        Array<IContactLaunchActionVerbsStatics?>
  }
}
