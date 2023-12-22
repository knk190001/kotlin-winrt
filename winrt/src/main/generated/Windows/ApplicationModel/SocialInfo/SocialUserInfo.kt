package Windows.ApplicationModel.SocialInfo

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

@ABIMarker(SocialUserInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.SocialInfo.SocialUserInfo;{9e5e1bd1-90d0-4e1d-9554-844d46607f61})")
@WinRTByReference(brClass = SocialUserInfo.ByReference::class)
public class SocialUserInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISocialUserInfo.WithDefault, IWinRTObject {
  private val __2097526358_Interface: ISocialUserInfo.WithDefault by lazy {
    as_2097526358()
  }


  public override val __2097526358_Ptr: JNAPointer? by lazy {
    __2097526358_Interface.__2097526358_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2097526358_Interface)

  private fun as_2097526358(): ISocialUserInfo.WithDefault {
    if(pointer == NULL) {
      return(ISocialUserInfo.ABI.makeISocialUserInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISocialUserInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISocialUserInfo.ABI.makeISocialUserInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SocialUserInfo>
      {
    public override fun getValue() = SocialUserInfo(pointer.getPointer(0))

    public fun setValue(value: SocialUserInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SocialUserInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SocialUserInfo {
      val address = segment.toRawLongValue()
      return SocialUserInfo(Pointer(address))
    }

    public override fun toNative(obj: SocialUserInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
