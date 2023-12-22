package Windows.Globalization

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(NumeralSystemIdentifiers.ABI::class)
@WinRTByReference(brClass = NumeralSystemIdentifiers.ByReference::class)
public class NumeralSystemIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NumeralSystemIdentifiers> {
    public override fun getValue() = NumeralSystemIdentifiers(pointer.getPointer(0))

    public fun setValue(value: NumeralSystemIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NumeralSystemIdentifiers, MemoryAddress> {
    public val INumeralSystemIdentifiersStatics2_Instance: INumeralSystemIdentifiersStatics2 by
        lazy {
      createINumeralSystemIdentifiersStatics2()
    }


    public val INumeralSystemIdentifiersStatics_Instance: INumeralSystemIdentifiersStatics by lazy {
      createINumeralSystemIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINumeralSystemIdentifiersStatics2(): INumeralSystemIdentifiersStatics2 {
      val refiid = Guid.REFIID(INumeralSystemIdentifiersStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.NumeralSystemIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          INumeralSystemIdentifiersStatics2.ABI.makeINumeralSystemIdentifiersStatics2(interfacePtr.value)
      return result
    }

    public fun createINumeralSystemIdentifiersStatics(): INumeralSystemIdentifiersStatics {
      val refiid = Guid.REFIID(INumeralSystemIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.NumeralSystemIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          INumeralSystemIdentifiersStatics.ABI.makeINumeralSystemIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NumeralSystemIdentifiers {
      val address = segment.toRawLongValue()
      return NumeralSystemIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: NumeralSystemIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Brah() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_Brah()

    public fun get_Osma() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_Osma()

    public fun get_MathBold() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_MathBold()

    public fun get_MathDbl() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_MathDbl()

    public fun get_MathSans() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_MathSans()

    public fun get_MathSanb() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_MathSanb()

    public fun get_MathMono() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_MathMono()

    public fun get_ZmthBold() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_ZmthBold()

    public fun get_ZmthDbl() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_ZmthDbl()

    public fun get_ZmthSans() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_ZmthSans()

    public fun get_ZmthSanb() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_ZmthSanb()

    public fun get_ZmthMono() = ABI.INumeralSystemIdentifiersStatics2_Instance.get_ZmthMono()

    public fun get_Arab() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Arab()

    public fun get_ArabExt() = ABI.INumeralSystemIdentifiersStatics_Instance.get_ArabExt()

    public fun get_Bali() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Bali()

    public fun get_Beng() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Beng()

    public fun get_Cham() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Cham()

    public fun get_Deva() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Deva()

    public fun get_FullWide() = ABI.INumeralSystemIdentifiersStatics_Instance.get_FullWide()

    public fun get_Gujr() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Gujr()

    public fun get_Guru() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Guru()

    public fun get_HaniDec() = ABI.INumeralSystemIdentifiersStatics_Instance.get_HaniDec()

    public fun get_Java() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Java()

    public fun get_Kali() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Kali()

    public fun get_Khmr() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Khmr()

    public fun get_Knda() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Knda()

    public fun get_Lana() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Lana()

    public fun get_LanaTham() = ABI.INumeralSystemIdentifiersStatics_Instance.get_LanaTham()

    public fun get_Laoo() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Laoo()

    public fun get_Latn() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Latn()

    public fun get_Lepc() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Lepc()

    public fun get_Limb() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Limb()

    public fun get_Mlym() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Mlym()

    public fun get_Mong() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Mong()

    public fun get_Mtei() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Mtei()

    public fun get_Mymr() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Mymr()

    public fun get_MymrShan() = ABI.INumeralSystemIdentifiersStatics_Instance.get_MymrShan()

    public fun get_Nkoo() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Nkoo()

    public fun get_Olck() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Olck()

    public fun get_Orya() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Orya()

    public fun get_Saur() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Saur()

    public fun get_Sund() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Sund()

    public fun get_Talu() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Talu()

    public fun get_TamlDec() = ABI.INumeralSystemIdentifiersStatics_Instance.get_TamlDec()

    public fun get_Telu() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Telu()

    public fun get_Thai() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Thai()

    public fun get_Tibt() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Tibt()

    public fun get_Vaii() = ABI.INumeralSystemIdentifiersStatics_Instance.get_Vaii()
  }
}
