package Windows.Media.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamDescriptor.ABI::class)
@Signature("{80f16e6e-92f7-451e-97d2-afd80742da70}")
@Guid("80f16e6e92f7451e97d2afd80742da70")
@WinRTInterface("80f16e6e92f7451e97d2afd80742da70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamDescriptor.ByReference::class)
public interface IMediaStreamDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSelected(): Boolean

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Name(): String?

  @InterfaceMethod(3)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Language(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamDescriptor> {
    public override fun getValue() = ABI.makeIMediaStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamDescriptor {
    public val __1209088862_Ptr: Pointer?

    public val _1209088862_VtblPtr: Pointer?
      get() = __1209088862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSelected(): Boolean {
      val fnPtr = _1209088862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1209088862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1209088862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1209088862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Name(): String? {
      val fnPtr = _1209088862_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1209088862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _1209088862_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1209088862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Language(): String? {
      val fnPtr = _1209088862_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1209088862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209088862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80f16e6e92f7451e97d2afd80742da70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamDescriptor(ptr: Pointer?): WithDefault =
        IMediaStreamDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamDescriptor {
      val address = segment.toRawLongValue()
      return makeIMediaStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209088862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamDescriptor): Array<IMediaStreamDescriptor?> =
        (elements as
        Array<IMediaStreamDescriptor?>).castToImpl<IMediaStreamDescriptor,IMediaStreamDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamDescriptor?> =
        arrayOfNulls<IMediaStreamDescriptor_Impl>(size) as Array<IMediaStreamDescriptor?>
  }
}
