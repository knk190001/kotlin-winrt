package Windows.ApplicationModel.Calls

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneVoicemail.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneVoicemail;{c9ce77f6-6e9f-3a8b-b727-6e0cf6998224})")
@WinRTByReference(brClass = PhoneVoicemail.ByReference::class)
public class PhoneVoicemail(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneVoicemail.WithDefault, IWinRTObject {
  private val __1117740519_Interface: IPhoneVoicemail.WithDefault by lazy {
    as_1117740519()
  }


  public override val __1117740519_Ptr: JNAPointer? by lazy {
    __1117740519_Interface.__1117740519_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1117740519_Interface)

  private fun as_1117740519(): IPhoneVoicemail.WithDefault {
    if(pointer == NULL) {
      return(IPhoneVoicemail.ABI.makeIPhoneVoicemail(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneVoicemail>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneVoicemail.ABI.makeIPhoneVoicemail(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PhoneVoicemail>
      {
    public override fun getValue() = PhoneVoicemail(pointer.getPointer(0))

    public fun setValue(value: PhoneVoicemail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneVoicemail, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneVoicemail {
      val address = segment.toRawLongValue()
      return PhoneVoicemail(Pointer(address))
    }

    public override fun toNative(obj: PhoneVoicemail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
