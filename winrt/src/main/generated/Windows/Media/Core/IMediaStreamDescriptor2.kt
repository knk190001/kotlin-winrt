package Windows.Media.Core

import Windows.Media.Core.IMediaStreamDescriptor.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamDescriptor2.ABI::class)
@Signature("{5073010f-e8b2-4071-b00b-ebf337a76b58}")
@Guid("5073010fe8b24071b00bebf337a76b58")
@WinRTInterface("5073010fe8b24071b00bebf337a76b58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamDescriptor2.ByReference::class)
public interface IMediaStreamDescriptor2 : NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
  @InterfaceMethod(0)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Label(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamDescriptor2> {
    public override fun getValue() = ABI.makeIMediaStreamDescriptor2(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamDescriptor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamDescriptor2, IMediaStreamDescriptor.WithDefault {
    public val __1172950892_Ptr: Pointer?

    public val _1172950892_VtblPtr: Pointer?
      get() = __1172950892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1172950892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1172950892_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Label(): String? {
      val fnPtr = _1172950892_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1172950892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamDescriptor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
    public override val __1209088862_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1172950892_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1172950892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamDescriptor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5073010fe8b24071b00bebf337a76b58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamDescriptor2(ptr: Pointer?): WithDefault =
        IMediaStreamDescriptor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamDescriptor2 {
      val address = segment.toRawLongValue()
      return makeIMediaStreamDescriptor2(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamDescriptor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1172950892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamDescriptor2): Array<IMediaStreamDescriptor2?>
        = (elements as
        Array<IMediaStreamDescriptor2?>).castToImpl<IMediaStreamDescriptor2,IMediaStreamDescriptor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamDescriptor2?> =
        arrayOfNulls<IMediaStreamDescriptor2_Impl>(size) as Array<IMediaStreamDescriptor2?>
  }
}
