package Windows.Media.Core

import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAudioStreamDescriptor2.ABI::class)
@Signature("{2e68f1f6-a448-497b-8840-85082665acf9}")
@Guid("2e68f1f6a448497b884085082665acf9")
@WinRTInterface("2e68f1f6a448497b884085082665acf9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioStreamDescriptor2.ByReference::class)
public interface IAudioStreamDescriptor2 : NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
  @InterfaceMethod(0)
  public fun put_LeadingEncoderPadding(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(1)
  public fun get_LeadingEncoderPadding(): IReference<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun put_TrailingEncoderPadding(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(3)
  public fun get_TrailingEncoderPadding(): IReference<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioStreamDescriptor2> {
    public override fun getValue() = ABI.makeIAudioStreamDescriptor2(pointer.getPointer(0))

    public fun setValue(value: IAudioStreamDescriptor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioStreamDescriptor2, IMediaStreamDescriptor.WithDefault {
    public val __178575646_Ptr: Pointer?

    public val _178575646_VtblPtr: Pointer?
      get() = __178575646_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_LeadingEncoderPadding(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _178575646_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178575646_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_LeadingEncoderPadding(): IReference<WinDef.UINT>? {
      val fnPtr = _178575646_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__178575646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_TrailingEncoderPadding(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _178575646_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__178575646_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TrailingEncoderPadding(): IReference<WinDef.UINT>? {
      val fnPtr = _178575646_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__178575646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioStreamDescriptor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaStreamDescriptor {
    public override val __1209088862_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_178575646_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __178575646_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioStreamDescriptor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e68f1f6a448497b884085082665acf9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioStreamDescriptor2(ptr: Pointer?): WithDefault =
        IAudioStreamDescriptor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioStreamDescriptor2 {
      val address = segment.toRawLongValue()
      return makeIAudioStreamDescriptor2(Pointer(address))
    }

    public override fun toNative(obj: IAudioStreamDescriptor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__178575646_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioStreamDescriptor2): Array<IAudioStreamDescriptor2?>
        = (elements as
        Array<IAudioStreamDescriptor2?>).castToImpl<IAudioStreamDescriptor2,IAudioStreamDescriptor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioStreamDescriptor2?> =
        arrayOfNulls<IAudioStreamDescriptor2_Impl>(size) as Array<IAudioStreamDescriptor2?>
  }
}
